package com.danpadgett.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.Tutorial;
import com.danpadgett.repository.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	TutorialRepository tutorialRepository;
	
	@Override
	public List<Tutorial> findAllTutorials() {
		return tutorialRepository.findAll();
	}
	
}
