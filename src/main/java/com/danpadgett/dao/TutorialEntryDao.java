package com.danpadgett.dao;

import java.util.List;

import com.danpadgett.model.TutorialEntry;

public interface TutorialEntryDao {

	TutorialEntry findById(long id);
	
	void saveTutorialEntry(TutorialEntry blog);
	
	void deleteTutorialEntry(long id);
	
	List<TutorialEntry> findAllTutorialEntries();
	
}
