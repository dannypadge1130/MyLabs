package com.danpadgett.dao;

import java.util.List;

import com.danpadgett.model.TutorialEntry;

public interface TutorialEntryDao {

	TutorialEntry findById(int id);
	
	void saveTutorialEntry(TutorialEntry blog);
	
	void deleteTutorialEntry(int id);
	
	List<TutorialEntry> findAllTutorialEntries();
	
}
