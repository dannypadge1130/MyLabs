package com.danpadgett.dao;

import java.util.List;

import com.danpadgett.model.Entry;

public interface EntryDao {

	List<Entry> findAllEntries();
	
}
