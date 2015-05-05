package com.danpadgett.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.password.PasswordEncoder;

@Document(collection="users")
public class User {

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
    @Indexed(unique=true)
    private String username;
    
    private String password;
    
    private String role;
 
    protected User() {
    }
 
    public User(String username, String password, String role ) {
        this.username = username;
        this.password = passwordEncoder.encode(password);
        this.role = role;
    }
 
    public String getId() { 
    	return id; 
    }
    
    public String getUsername() { 
    	return username; 
    }
    
    public String getSHA1Password() { 
    	return password; 
    }
    
    public String getRole() { 
    	return role; 
    }
	
}
