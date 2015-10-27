package com.danpadgett.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BlogEntry")
public class BlogEntry extends Entry {

	private static final String BLOG_ENTRY_TYPE = "blog";
	
	public BlogEntry() {
		super(BLOG_ENTRY_TYPE);
	}

}
