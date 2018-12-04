package com.danpadgett.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BlogEntry")
public class BlogEntry extends Entry {

	public BlogEntry() {
		super.setType("blog");
	}
	
	
}
