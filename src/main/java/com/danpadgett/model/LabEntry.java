package com.danpadgett.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LabEntry")
public class LabEntry extends Entry {
	
	private static final String LAB_ENTRY_TYPE = "lab";
	
	@Column(name="liveurl")
	private String liveURL;
	
	@Column(name="repoURL")
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
