package com.danpadgett.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.dao.BlogEntryDao;
import com.danpadgett.dao.LabEntryDao;
import com.danpadgett.dao.TutorialEntryDao;

@Service("entryService")
public class EntryServiceImpl implements EntryService {

	@Autowired
	BlogEntryDao blogDao;
	
	@Autowired
	LabEntryDao labDao;
	
	@Autowired
	TutorialEntryDao tutorialDao;
	
//	@Override
//	public List<Entry> findAllEntry() {
//		
//		List<Entry> entries = new ArrayList<Entry>();
//		entries.addAll(blogDao.findAllBlogEntries());
//		entries.addAll(labDao.findAllLabEntries());
//		entries.addAll(tutorialDao.findAllTutorialEntries());
//		
//		return entries;
//	}
}
