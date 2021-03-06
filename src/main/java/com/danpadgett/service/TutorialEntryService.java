package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.TutorialEntry;

public interface TutorialEntryService {

	public List<TutorialEntry> findAllTutorialEntries();
	
	public TutorialEntry findTutorialEntry(long tutorialId);
	
	public void deleteTutorialEntry(long tutorialId);
	
	public void updateTutorialEntry(long tutorialId, TutorialEntry tutorialEntry);

	public void createTutorialEntry(TutorialEntry tutorialEntry);
}
