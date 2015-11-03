package com.danpadgett.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id", nullable=false, unique=true)
	private long id;
	
	@Column(name="createdate", nullable=false)
	private Date createdDate;
	
	@Column(name="modifieddate", nullable=false)
	private Date modifiedDate;
	
	@Column(name="title", length=50)
	private String title;
	
	@Column(name="description", length=200)
	private String description;
	
	@Column(name="body")
	@Lob
	private String body;
	
	@Column(name="bannerImageUrl", length=50)
	private String bannerImageUrl;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}

	public String getBannerImageUrl() {
		return bannerImageUrl;
	}

	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}
	
	public long getId() {
		return this.id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getModifiedDate() {
		return modifiedDate;
	}
	
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
