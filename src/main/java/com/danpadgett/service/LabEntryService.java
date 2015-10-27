package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.LabEntry;

public interface LabEntryService {

	public List<LabEntry> findAllLabEntries();
	
	public LabEntry findLabEntry(int labId);
	
	public void deleteLabEntry(int labId);
	
	public void updateLabEntry(int labId, LabEntry lab);
	
	public void createLabEntry(LabEntry lab);
}
