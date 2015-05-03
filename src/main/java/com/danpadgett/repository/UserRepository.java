package com.danpadgett.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
	
	User findByUsername(String username);
	
}
