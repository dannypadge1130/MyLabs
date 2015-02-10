package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.LabEntry;

public interface LabService {

	public List<LabEntry> findAllLabs();
	
	public LabEntry findLab(long labId);
	
}
