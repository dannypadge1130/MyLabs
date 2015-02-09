package com.danpadgett.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.TutorialEntry;
import com.danpadgett.repository.TutorialEntryRepository;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	TutorialEntryRepository tutorialRepository;
	
	@Override
	public List<TutorialEntry> findAllTutorials() {
		return tutorialRepository.findAll();
	}
	
}
