package com.danpadgett.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danpadgett.dao.TutorialEntryDao;
import com.danpadgett.model.TutorialEntry;

@Service("tutorialEntryService")
@Transactional
public class TutorialEntryServiceImpl implements TutorialEntryService {

	@Autowired
	TutorialEntryDao dao;
	
	public List<TutorialEntry> findAllTutorialEntries() {
		return dao.findAllTutorialEntries();
	}

	public TutorialEntry findTutorialEntry(int tutorialEntryId) {
		return dao.findById(tutorialEntryId);
	}
	
	public void deleteTutorialEntry(int tutorialEntryId) {
		dao.deleteTutorialEntry(tutorialEntryId);
	}

	public void updateTutorialEntry(int tutorialId, TutorialEntry tutorialEntry) {
		
		TutorialEntry oldTutorialEntry = dao.findById(tutorialId);
		oldTutorialEntry.setBannerImageUrl(tutorialEntry.getBannerImageUrl());
		oldTutorialEntry.setBody(tutorialEntry.getBody());
		oldTutorialEntry.setDescription(tutorialEntry.getDescription());
		oldTutorialEntry.setTitle(tutorialEntry.getTitle());
		oldTutorialEntry.setModifiedDate(new Date());
		
		dao.saveTutorialEntry(oldTutorialEntry);
	}
	
	public void createTutorialEntry(TutorialEntry tutorialEntry) {
		dao.saveTutorialEntry(tutorialEntry);
	}
	
}
