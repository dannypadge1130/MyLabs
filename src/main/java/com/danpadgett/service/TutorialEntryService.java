package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.TutorialEntry;

public interface TutorialEntryService {

	public List<TutorialEntry> findAllTutorialEntries();
	
	public TutorialEntry findTutorialEntry(int tutorialId);
	
	public void deleteTutorialEntry(int tutorialId);
	
	public void updateTutorialEntry(int tutorialId, TutorialEntry tutorialEntry);

	public void createTutorialEntry(TutorialEntry tutorialEntry);
}
