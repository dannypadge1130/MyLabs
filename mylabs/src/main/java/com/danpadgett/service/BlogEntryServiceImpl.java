package com.danpadgett.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.repository.BlogEntryRepository;

@Service
public class BlogEntryServiceImpl implements BlogEntryService {

	@Autowired
	private BlogEntryRepository blogEntryRepository;
	
	public List<BlogEntry> findAllBlogEntries() {
		return blogEntryRepository.findAll();
	}
	
}
