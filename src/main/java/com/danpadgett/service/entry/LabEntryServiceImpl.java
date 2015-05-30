package com.danpadgett.service.entry;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danpadgett.model.LabEntry;
import com.danpadgett.repository.LabEntryRepository;

@Service
public class LabEntryServiceImpl implements LabEntryService {

	@Autowired
	LabEntryRepository labRepository;
	
	public List<LabEntry> findAllLabEntries() {
		return labRepository.findAll();
	}

	public LabEntry findLabEntry(String labEntryId) {
		return labRepository.findOne(labEntryId);
	}
	
	public void deleteLabEntry(String labEntryId) {
		labRepository.delete(labEntryId);
	}
	
	public void deleteLabEntry(LabEntry labEntry) {
		labRepository.delete(labEntry);
	}
	
	public void deleteLabEntries(Set<LabEntry> labEntries) {
		labRepository.delete(labEntries);
	}

	@Transactional
	public LabEntry updateLabEntry(String labId, LabEntry lab) {
		
		LabEntry oldLab = labRepository.findOne(labId);
		oldLab.setBannerImageUrl(lab.getBannerImageUrl());
		oldLab.setBody(lab.getBody());
		oldLab.setDescription(lab.getDescription());
		oldLab.setLiveURL(lab.getLiveURL());
		oldLab.setRepoURL(lab.getRepoURL());
		oldLab.setTitle(lab.getTitle());
		oldLab.setModifiedDate(new Date());
		
		return labRepository.save(oldLab);
	}
	
	@Transactional
	public LabEntry createLabEntry(LabEntry lab) {
		return labRepository.save(lab);
	}
	
}
