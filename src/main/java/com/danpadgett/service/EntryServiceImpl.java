package com.danpadgett.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.Entry;

@Service(value="entryService")
public class EntryServiceImpl implements EntryService {

	@Autowired
	BlogEntryService blogEntryService;
	
	@Autowired
	LabEntryService labEntryService;
	
	@Autowired
	TutorialEntryService tutorialEntryService;
	
	@Override
	public List<Entry> findAllEntries() {
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.addAll(blogEntryService.findAllBlogEntries());
		entries.addAll(labEntryService.findAllLabEntries());
		entries.addAll(tutorialEntryService.findAllTutorialEntries());
		
		return entries;
	}
	
}
