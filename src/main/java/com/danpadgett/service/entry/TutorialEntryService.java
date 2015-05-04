package com.danpadgett.service.entry;

import java.util.List;
import java.util.Set;

import com.danpadgett.model.TutorialEntry;

public interface TutorialEntryService {

	public List<TutorialEntry> findAllTutorialEntries();
	
	public TutorialEntry findTutorialEntry(long tutorialId);
	
	public void deleteTutorialEntry(long tutorialId);
	
	public void deleteTutorialEntry(TutorialEntry tutorialEntry);
	
	public void deleteTutorialEntries(Set<TutorialEntry> tutorialEntries);
	
	public TutorialEntry updateTutorialEntry(long tutorialId);
	
	public TutorialEntry updateTutorialEntry(TutorialEntry tutorialEntry);

}
