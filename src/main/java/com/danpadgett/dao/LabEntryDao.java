package com.danpadgett.dao;

import java.util.List;

import com.danpadgett.model.LabEntry;

public interface LabEntryDao {

	LabEntry findById(long id);
	
	void saveLabEntry(LabEntry blog);
	
	void deleteLabEntry(long id);
	
	List<LabEntry> findAllLabEntries();
	
}
