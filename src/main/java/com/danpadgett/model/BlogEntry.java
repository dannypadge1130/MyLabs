package com.danpadgett.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="blogentry")
public class BlogEntry extends Entry {

	private static final String BLOG_ENTRY_TYPE = "blog";
	
	public BlogEntry() {
		super(BLOG_ENTRY_TYPE);
	}

}
