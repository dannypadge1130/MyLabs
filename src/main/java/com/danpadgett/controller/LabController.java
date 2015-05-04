package com.danpadgett.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LabController {

	@RequestMapping(value="/lab/view/{labId}", method=RequestMethod.GET)
	public String view(@PathVariable long labId, Model model) {
		model.addAttribute("id", labId);
		return "/lab/view";
	}
	
	@RequestMapping(value="/lab/admin/edit/{labId}", method=RequestMethod.GET)
	public String edit(@PathVariable long labId, Model model) {
		model.addAttribute("id", labId);
		return "/lab/admin/edit";
	}
	
}
