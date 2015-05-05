package com.danpadgett.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.BlogEntry;

@Repository
public interface BlogEntryRepository extends MongoRepository<BlogEntry, String> {
	
}
