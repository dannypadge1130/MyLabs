package com.danpadgett.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String viewApplication() {
		return "home";
	}
	
	@RequestMapping(value="/blog/{blogEntryId}", method=RequestMethod.GET)
	public String viewBlogEntry(@PathVariable long blogEntryId, Model model) {
		model.addAttribute("id", blogEntryId);
		return "blog";
	}
	
	@RequestMapping(value="/tutorial/{tutorialId}", method=RequestMethod.GET)
	public String viewTutorial(@PathVariable long tutorialId, Model model) {
		model.addAttribute("id", tutorialId);
		return "tutorial";
	}
	
	@RequestMapping(value="/lab/{labId}", method=RequestMethod.GET)
	public String viewLab(@PathVariable long labId, Model model) {
		model.addAttribute("id", labId);
		return "lab";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String viewAbout() {
		return "about";
	}
	
	@RequestMapping(value="/admin/edit", method=RequestMethod.GET)
	public String edit() {
		return "admin/edit";
	}
}