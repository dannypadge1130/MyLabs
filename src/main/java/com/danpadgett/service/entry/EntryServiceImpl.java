package com.danpadgett.service.entry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.Entry;
import com.danpadgett.repository.BlogEntryRepository;
import com.danpadgett.repository.LabEntryRepository;
import com.danpadgett.repository.TutorialEntryRepository;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	BlogEntryRepository blogEntryRepository;
	
	@Autowired
	LabEntryRepository labRepository;
	
	@Autowired
	TutorialEntryRepository tutorialRepository;
	
	@Override
	public List<Entry> findAllEntry() {
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.addAll(blogEntryRepository.findAll());
		entries.addAll(labRepository.findAll());
		entries.addAll(tutorialRepository.findAll());
		
		return entries;
	}
}
