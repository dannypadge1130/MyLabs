package com.danpadgett.service.entry;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danpadgett.model.TutorialEntry;
import com.danpadgett.repository.TutorialEntryRepository;

@Service
public class TutorialEntryServiceImpl implements TutorialEntryService {

	@Autowired
	TutorialEntryRepository tutorialRepository;
	
	public List<TutorialEntry> findAllTutorialEntries() {
		return tutorialRepository.findAll();
	}

	public TutorialEntry findTutorialEntry(String tutorialEntryId) {
		return tutorialRepository.findOne(tutorialEntryId);
	}
	
	public void deleteTutorialEntry(String tutorialEntryId) {
		tutorialRepository.delete(tutorialEntryId);
	}
	
	public void deleteTutorialEntry(TutorialEntry tutorialEntry) {
		tutorialRepository.delete(tutorialEntry);
	}
	
	public void deleteTutorialEntries(Set<TutorialEntry> tutorialEntries) {
		tutorialRepository.delete(tutorialEntries);
	}

	@Transactional
	public TutorialEntry updateTutorialEntry(String tutorialId, TutorialEntry tutorialEntry) {
		
		TutorialEntry oldTutorialEntry = tutorialRepository.findOne(tutorialId);
		oldTutorialEntry.setBannerImageUrl(tutorialEntry.getBannerImageUrl());
		oldTutorialEntry.setBody(tutorialEntry.getBody());
		oldTutorialEntry.setDescription(tutorialEntry.getDescription());
		oldTutorialEntry.setTitle(tutorialEntry.getTitle());
		oldTutorialEntry.setModifiedDate(new Date());
		
		return tutorialRepository.save(oldTutorialEntry);
	}
	
	@Transactional
	public TutorialEntry createTutorialEntry(TutorialEntry tutorialEntry) {
		return tutorialRepository.save(tutorialEntry);
	}
	
}
