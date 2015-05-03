package com.danpadgett.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.danpadgett.repository.UserRepository;


@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	private UserRepository repository;
	
    @Autowired
    public UserDetailsServiceImpl(UserRepository repository) {
        this.repository = repository;
    }
 
    public UserDetails loadUserByUsername( String username ) throws UsernameNotFoundException {
        
    	com.danpadgett.model.User user = repository.findByUsername(username);
 
        if( user == null ) {
            throw new UsernameNotFoundException( "Oops!" );
        }
 
        List<SimpleGrantedAuthority> authorities = Arrays.asList( new SimpleGrantedAuthority( user.getRole() ) );
 
        return new User(user.getUsername(), user.getSHA1Password(), authorities );
    }
	
}
