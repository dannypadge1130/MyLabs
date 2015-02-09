package com.danpadgett.model;

import org.hibernate.validator.constraints.URL;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="lab")
public class LabEntry extends Entry {
	
	private static final String LAB_ENTRY_TYPE = "lab";
	
	@URL
	private String liveURL;
	
	@URL
	private String repoURL;
		
	public LabEntry() {
		super(LAB_ENTRY_TYPE);
	}
	
	public String getLiveURL() {
		return liveURL;
	}
	public void setLiveURL(String liveURL) {
		this.liveURL = liveURL;
	}
	public String getRepoURL() {
		return repoURL;
	}
	public void setRepoURL(String repoURL) {
		this.repoURL = repoURL;
	}
}
