package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.BlogEntry;

public interface BlogEntryService {
	
	public List<BlogEntry> findAllBlogEntries();
	
}
