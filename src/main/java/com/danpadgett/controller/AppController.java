package com.danpadgett.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String viewApplication() {
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String viewHome() {
		return "home";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String viewAbout() {
		return "about";
	}
	
	@RequestMapping(value="/admin/newEntry", method=RequestMethod.GET)
	public String viewNewEntry() {
		return "newEntry";
	}
	
}