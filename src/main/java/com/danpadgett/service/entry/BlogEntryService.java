package com.danpadgett.service.entry;

import java.util.List;
import java.util.Set;

import com.danpadgett.model.BlogEntry;

public interface BlogEntryService {
	
	public List<BlogEntry> findAllBlogEntries();
	
	public BlogEntry findBlogEntry(String blogEntryId);
	
	public void deleteBlogEntry(String blogEntryId);
	
	public void deleteBlogEntry(BlogEntry blogEntry);
	
	public void deleteBlogEntries(Set<BlogEntry> blogEntries);
	
	public BlogEntry updateBlogEntry(String blogEntryId, BlogEntry blogEntry);
	
	public BlogEntry createBlogEntry(BlogEntry blogEntry);

}
