package com.danpadgett.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String viewApplication() {
		return "home";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String viewAbout() {
		return "about";
	}
}
