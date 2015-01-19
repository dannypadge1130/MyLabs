package com.danpadgett.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.Lab;
import com.danpadgett.repository.LabRepository;

@Service
public class LabServiceImpl implements LabService {

	@Autowired
	LabRepository labRepository;
	
	@Override
	public List<Lab> findAllLabs() {
		return labRepository.findAll();
	}

}
