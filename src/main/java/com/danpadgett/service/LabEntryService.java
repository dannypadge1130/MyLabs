package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.LabEntry;

public interface LabEntryService {

	public List<LabEntry> findAllLabEntries();
	
	public LabEntry findLabEntry(long labId);
	
	public void deleteLabEntry(long labId);
	
	public void updateLabEntry(long labId, LabEntry lab);
	
	public void createLabEntry(LabEntry lab);
}
