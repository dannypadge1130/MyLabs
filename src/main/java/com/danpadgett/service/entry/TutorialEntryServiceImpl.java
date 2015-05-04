package com.danpadgett.service.entry;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.TutorialEntry;
import com.danpadgett.repository.TutorialEntryRepository;

@Service
public class TutorialEntryServiceImpl implements TutorialEntryService {

	@Autowired
	TutorialEntryRepository tutorialRepository;
	
	public List<TutorialEntry> findAllTutorialEntries() {
		return tutorialRepository.findAll();
	}

	public TutorialEntry findTutorialEntry(long tutorialEntryId) {
		return tutorialRepository.findOne(tutorialEntryId);
	}
	
	public void deleteTutorialEntry(long tutorialEntryId) {
		tutorialRepository.delete(tutorialEntryId);
	}
	
	public void deleteTutorialEntry(TutorialEntry tutorialEntry) {
		tutorialRepository.delete(tutorialEntry);
	}
	
	public void deleteTutorialEntries(Set<TutorialEntry> tutorialEntries) {
		tutorialRepository.delete(tutorialEntries);
	}
	
}
