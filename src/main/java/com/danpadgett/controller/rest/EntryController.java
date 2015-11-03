package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.service.BlogEntryService;

@RestController
public class EntryController {

	@Autowired
	private BlogEntryService blogEntryService;
	
	@Autowired
	
	@RequestMapping(value="/api/entries", method=RequestMethod.GET) 
	public @ResponseBody List<BlogEntry> getAllBlogEntries() {
		return blogEntryService.findAllBlogEntries();
	}
	
}
