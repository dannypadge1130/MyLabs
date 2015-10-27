package com.danpadgett.dao;

import java.util.List;

import com.danpadgett.model.BlogEntry;

public interface BlogEntryDao {

	BlogEntry findById(int id);
	
	void saveBlogEntry(BlogEntry blog);
	
	void deleteBlogEntry(int id);
	
	List<BlogEntry> findAllBlogEntries();
	
}
