package com.danpadgett.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tutorial")
public class TutorialEntry extends Entry {

	private static final String TUTORIAL_ENTRY_TYPE = "tutorial";
	
	public TutorialEntry() {
		super(TUTORIAL_ENTRY_TYPE);
	}
	
}
