package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.BlogEntry;

public interface BlogEntryService {
	
	public List<BlogEntry> findAllBlogEntries();
	
	public BlogEntry findBlogEntry(int blogEntryId);
	
	public void deleteBlogEntry(int blogEntryId);
	
	public void updateBlogEntry(int blogEntryId, BlogEntry blogEntry);
	
	public void createBlogEntry(BlogEntry blogEntry);

}
