package com.danpadgett.service.entry;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.LabEntry;
import com.danpadgett.repository.LabEntryRepository;

@Service
public class LabEntryServiceImpl implements LabEntryService {

	@Autowired
	LabEntryRepository labRepository;
	
	public List<LabEntry> findAllLabEntries() {
		return labRepository.findAll();
	}

	public LabEntry findLabEntry(long labEntryId) {
		return labRepository.findOne(labEntryId);
	}
	
	public void deleteLabEntry(long labEntryId) {
		labRepository.delete(labEntryId);
	}
	
	public void deleteLabEntry(LabEntry labEntry) {
		labRepository.delete(labEntry);
	}
	
	public void deleteLabEntries(Set<LabEntry> labEntries) {
		labRepository.delete(labEntries);
	}

	public LabEntry updateLabEntry(long labId) {
		return updateLabEntry(labRepository.findOne(labId));
	}

	public LabEntry updateLabEntry(LabEntry lab) {
		//TODO: update lab
		return lab;
	}
}
