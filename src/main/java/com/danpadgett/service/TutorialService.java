package com.danpadgett.service;

import java.util.List;

import com.danpadgett.model.TutorialEntry;

public interface TutorialService {

	public List<TutorialEntry> findAllTutorials();
	
}
