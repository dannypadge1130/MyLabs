package com.danpadgett.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.service.entry.BlogEntryService;

@Controller
public class BlogController {
	
	@Autowired
	private BlogEntryService blogEntryService;
	
	@RequestMapping(value="/blog/view/{blogEntryId}", method=RequestMethod.GET)
	public String view(@PathVariable String blogEntryId, Model model) {
		model.addAttribute("id", blogEntryId);
		return "/blog/view";
	}
	
	@RequestMapping(value="/blog/admin/edit/{blogEntryId}", method=RequestMethod.GET)
	public String edit(@PathVariable String blogEntryId, Model model) {
		model.addAttribute("id", blogEntryId);
		
		BlogEntry be = new BlogEntry();
		be.setBannerImageUrl("http://creative-jar.com/wp-content/uploads/banner_apple.jpg");
		be.setBody("THIS IS SOME TEXT");
		be.setCreatedDate(new Date());
		be.setModifiedDate(new Date());
		be.setListImageUrl("https://cdn1.iconfinder.com/data/icons/simple-icons/4096/apple-4096-black.png");
		be.setTitle("TEST TITLE");
		blogEntryService.createBlogEntry(be);
		
		return "/blog/admin/edit";
	}
	
}
