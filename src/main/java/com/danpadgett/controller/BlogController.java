package com.danpadgett.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {
	
	@RequestMapping(value="/blog/view/{blogEntryId}", method=RequestMethod.GET)
	public String view(@PathVariable long blogEntryId, Model model) {
		model.addAttribute("id", blogEntryId);
		return "/blog/view";
	}
	
	@RequestMapping(value="/blog/admin/edit/{blogEntryId}", method=RequestMethod.GET)
	public String edit(@PathVariable long blogEntryId, Model model) {
		model.addAttribute("id", blogEntryId);
		return "/blog/admin/edit";
	}
	
}
