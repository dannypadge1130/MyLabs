package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.BlogEntry;

public interface BlogEntryService {
	
	public List<BlogEntry> findAllBlogEntries();
	
	public BlogEntry findBlogEntry(long blogEntryId);
	
	public void deleteBlogEntry(long blogEntryId);
	
	public void updateBlogEntry(long blogEntryId, BlogEntry blogEntry);
	
	public void createBlogEntry(BlogEntry blogEntry);

}
