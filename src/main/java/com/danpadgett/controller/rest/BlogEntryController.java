package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.service.BlogEntryService;

@RestController
public class BlogEntryController {

	@Autowired
	private BlogEntryService blogEntryService;
	
	@RequestMapping(value="/api/blog-entries", method=RequestMethod.GET) 
	public List<BlogEntry> getBlogEntries() {
		return blogEntryService.findAllBlogEntries();
	}
}
