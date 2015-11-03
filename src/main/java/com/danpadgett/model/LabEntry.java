package com.danpadgett.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LabEntry")
public class LabEntry extends Entry {
	
	@Column(name="liveurl", length=50)
	private String liveURL;
	
	@Column(name="repoURL", length=50)
	private String repoURL;
	
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
