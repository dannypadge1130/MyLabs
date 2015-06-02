package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.service.entry.BlogEntryService;

@RestController
public class BlogEntryController {

	@Autowired
	private BlogEntryService blogEntryService;
	
	@RequestMapping(value="/api/blog-entries", method=RequestMethod.GET) 
	public @ResponseBody List<BlogEntry> getAllBlogEntries() {
		return blogEntryService.findAllBlogEntries();
	}
	
	@RequestMapping(value="/api/blog/{blogEntryId}", method=RequestMethod.GET)
	public @ResponseBody BlogEntry getBlogEntry(@PathVariable String blogEntryId) {
		return blogEntryService.findBlogEntry(blogEntryId);
	}
	
	@RequestMapping(value="/api/admin/blog/{blogEntryId}", method=RequestMethod.DELETE)
	public void deleteBlogEntry(@PathVariable String blogEntryId) {
		blogEntryService.deleteBlogEntry(blogEntryId);
	}
	
	@RequestMapping(value="/api/admin/blog/{blogEntryId}",method=RequestMethod.PUT)
	public @ResponseBody BlogEntry updateBlogEntry(@PathVariable String blogEntryId, @RequestBody BlogEntry blogEntry) {
		return blogEntryService.updateBlogEntry(blogEntryId, blogEntry);
	}
	
	@RequestMapping(value="/api/admin/blog", method=RequestMethod.POST)
	public @ResponseBody BlogEntry createBlogEntry(@RequestBody BlogEntry blogEntry) {
		return blogEntryService.createBlogEntry(blogEntry);
	}
}