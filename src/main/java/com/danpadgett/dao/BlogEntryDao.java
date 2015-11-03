package com.danpadgett.dao;

import java.util.List;

import com.danpadgett.model.BlogEntry;

public interface BlogEntryDao {

	BlogEntry findById(long id);
	
	void saveBlogEntry(BlogEntry blog);
	
	void deleteBlogEntry(long id);
	
	List<BlogEntry> findAllBlogEntries();
	
}
