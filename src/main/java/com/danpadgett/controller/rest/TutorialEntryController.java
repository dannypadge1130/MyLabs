package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.TutorialEntry;
import com.danpadgett.service.entry.TutorialEntryService;

@RestController
public class TutorialEntryController {

	@Autowired
	private TutorialEntryService tutorialService;
	
	@RequestMapping(value="/api/tutorials", method=RequestMethod.GET) 
	public List<TutorialEntry> getAllTutorials() {
		return tutorialService.findAllTutorialEntries();
	}
	
	@RequestMapping(value="/api/tutorial/{tutorialId}", method=RequestMethod.GET)
	public TutorialEntry getTutorial(@PathVariable String tutorialId, Model model) {
		return tutorialService.findTutorialEntry(tutorialId);
	}
	
	@RequestMapping(value="/api/admin/tutorial/{tutorialId}", method=RequestMethod.DELETE)
	public void deleteTutorial(@PathVariable String tutorialId) {
		tutorialService.deleteTutorialEntry(tutorialId);
	}
	
	@RequestMapping(value="/api/admin/tutorial/{tutorialId}", method = RequestMethod.PUT)
	public TutorialEntry updateTutorial(@PathVariable String tutorialId, @RequestBody TutorialEntry tutorial) {
		return tutorialService.updateTutorialEntry(tutorialId, tutorial);
	}
}
