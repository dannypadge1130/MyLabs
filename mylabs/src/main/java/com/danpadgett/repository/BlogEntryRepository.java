package com.danpadgett.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.BlogEntry;

@Repository
public interface BlogEntryRepository extends MongoRepository<BlogEntry, Long> {

	List<BlogEntry> findByAuthor(String author);
	
}
