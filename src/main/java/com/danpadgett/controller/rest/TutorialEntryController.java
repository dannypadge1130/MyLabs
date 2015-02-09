package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.TutorialEntry;
import com.danpadgett.service.TutorialService;

@RestController
public class TutorialEntryController {

	@Autowired
	private TutorialService tutorialService;
	
	@RequestMapping(value="/api/tutorials", method=RequestMethod.GET) 
	public List<TutorialEntry> getAllTutorials() {
		return tutorialService.findAllTutorials();
	}
	
}
