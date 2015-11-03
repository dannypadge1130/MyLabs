package com.danpadgett.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danpadgett.dao.LabEntryDao;
import com.danpadgett.model.LabEntry;

@Service("labEntryService")
@Transactional
public class LabEntryServiceImpl implements LabEntryService {

	@Autowired
	LabEntryDao dao;
	
	public List<LabEntry> findAllLabEntries() {
		return dao.findAllLabEntries();
	}

	public LabEntry findLabEntry(long labEntryId) {
		return dao.findById(labEntryId);
	}
	
	public void deleteLabEntry(long labEntryId) {
		dao.deleteLabEntry(labEntryId);
	}
	
	public void updateLabEntry(long labId, LabEntry lab) {
		
		LabEntry oldLab = dao.findById(labId);
		oldLab.setBannerImageUrl(lab.getBannerImageUrl());
		oldLab.setBody(lab.getBody());
		oldLab.setDescription(lab.getDescription());
		oldLab.setLiveURL(lab.getLiveURL());
		oldLab.setRepoURL(lab.getRepoURL());
		oldLab.setTitle(lab.getTitle());
		oldLab.setModifiedDate(new Date());
		
		dao.saveLabEntry(oldLab);
	}
	
	public void createLabEntry(LabEntry lab) {
		dao.saveLabEntry(lab);
	}
	
}
