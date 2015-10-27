package com.danpadgett.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TutorialEntry")
public class TutorialEntry extends Entry {

	private static final String TUTORIAL_ENTRY_TYPE = "tutorial";
	
	public TutorialEntry() {
		super(TUTORIAL_ENTRY_TYPE);
	}
	
}
