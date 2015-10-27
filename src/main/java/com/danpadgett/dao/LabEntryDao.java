package com.danpadgett.dao;

import java.util.List;

import com.danpadgett.model.LabEntry;

public interface LabEntryDao {

	LabEntry findById(int id);
	
	void saveLabEntry(LabEntry blog);
	
	void deleteLabEntry(int id);
	
	List<LabEntry> findAllLabEntries();
	
}
