package com.danpadgett.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.LabEntry;
import com.danpadgett.repository.LabEntryRepository;

@Service
public class LabServiceImpl implements LabService {

	@Autowired
	LabEntryRepository labRepository;
	
	@Override
	public List<LabEntry> findAllLabs() {
		return labRepository.findAll();
	}

	@Override
	public LabEntry findLab(long labId) {
		return labRepository.findOne(labId);
	}
}
