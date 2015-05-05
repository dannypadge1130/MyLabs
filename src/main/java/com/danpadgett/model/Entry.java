package com.danpadgett.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class Entry {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	private Date createdDate;
	private Date modifiedDate;
	
	private String title;
	private String body;
	
	private String listImageUrl;
	private String bannerImageUrl;
	
	private String type;
	
	public Entry(String type) {
		this.type = type;
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

	public String getListImageUrl() {
		return listImageUrl;
	}
	
	public void setListImageUrl(String listImageUrl) {
		this.listImageUrl = listImageUrl;
	}

	public String getBannerImageUrl() {
		return bannerImageUrl;
	}

	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}
	
	public String getType() {
		return this.type;
	}
	public String getId() {
		return this.id;
	}
}
