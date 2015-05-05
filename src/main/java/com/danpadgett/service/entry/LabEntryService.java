package com.danpadgett.service.entry;

import java.util.List;
import java.util.Set;

import com.danpadgett.model.LabEntry;

public interface LabEntryService {

	public List<LabEntry> findAllLabEntries();
	
	public LabEntry findLabEntry(String labId);
	
	public void deleteLabEntry(String labId);
	
	public void deleteLabEntry(LabEntry lab);
	
	public void deleteLabEntries(Set<LabEntry> labEntries);
	
	public LabEntry updateLabEntry(String labId, LabEntry lab);
}
