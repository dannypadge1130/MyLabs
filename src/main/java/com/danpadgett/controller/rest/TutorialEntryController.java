package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.TutorialEntry;
import com.danpadgett.service.TutorialEntryService;

@RestController
public class TutorialEntryController {

	@Autowired
	private TutorialEntryService tutorialService;
	
	@RequestMapping(value="/api/tutorials", method=RequestMethod.GET) 
	public @ResponseBody List<TutorialEntry> getAllTutorials() {
		return tutorialService.findAllTutorialEntries();
	}
	
	@RequestMapping(value="/api/tutorial/{tutorialId}", method=RequestMethod.GET)
	public @ResponseBody TutorialEntry getTutorial(@PathVariable long tutorialId, Model model) {
		return tutorialService.findTutorialEntry(tutorialId);
	}
	
	@RequestMapping(value="/api/admin/tutorial/{tutorialId}", method=RequestMethod.DELETE)
	public void deleteTutorial(@PathVariable long tutorialId) {
		tutorialService.deleteTutorialEntry(tutorialId);
	}
	
	@RequestMapping(value="/api/admin/tutorial/{tutorialId}", method=RequestMethod.POST)
	public @ResponseBody TutorialEntry updateTutorial(@PathVariable long tutorialId, @RequestBody TutorialEntry tutorialEntry) {
		tutorialService.updateTutorialEntry(tutorialId, tutorialEntry);
		return tutorialService.findTutorialEntry(tutorialId);
	}
	
	@RequestMapping(value="/api/admin/tutorial", method=RequestMethod.POST)
	public void createTutorial(@RequestBody TutorialEntry tutorialEntry) {
		tutorialService.createTutorialEntry(tutorialEntry);
	}
}
