package com.danpadgett.service.entry;

import java.util.List;
import java.util.Set;

import com.danpadgett.model.BlogEntry;

public interface BlogEntryService {
	
	public List<BlogEntry> findAllBlogEntries();
	
	public BlogEntry findBlogEntry(long blogEntryId);
	
	public void deleteBlogEntry(long blogEntryId);
	
	public void deleteBlogEntry(BlogEntry blogEntry);
	
	public void deleteBlogEntries(Set<BlogEntry> blogEntries);
	
	public BlogEntry updateBlogEntry(long blogEntryId);
	
	public BlogEntry updateBlogEntry(BlogEntry blogEntry);

}
