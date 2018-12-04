package com.danpadgett.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.model.Entry;
import com.danpadgett.model.LabEntry;
import com.danpadgett.model.TutorialEntry;
import com.danpadgett.service.BlogEntryService;
import com.danpadgett.service.LabEntryService;
import com.danpadgett.service.TutorialEntryService;

@RestController
public class EntryController {

	@Autowired
	private BlogEntryService blogEntryService;
	
	@Autowired
	private LabEntryService labEntryService;
	
	@Autowired
	private TutorialEntryService tutorialEntryService;
	
	@RequestMapping(value="/api/entries", method=RequestMethod.GET) 
	public @ResponseBody List<Entry> getAllEntries() {
		List<BlogEntry> blogEntries = blogEntryService.findAllBlogEntries();
		List<LabEntry> labEntries = labEntryService.findAllLabEntries();
		List<TutorialEntry> tutorialEntry = tutorialEntryService.findAllTutorialEntries();
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.addAll(blogEntries);
		entries.addAll(labEntries);
		entries.addAll(tutorialEntry);
		
		return entries;
	}
	
}
