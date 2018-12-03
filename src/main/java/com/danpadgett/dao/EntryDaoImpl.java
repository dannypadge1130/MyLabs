package com.danpadgett.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.danpadgett.model.Entry;

@Repository("entryDao")
public class EntryDaoImpl extends AbstractDao<Long, Entry> implements EntryDao {

	@Override
	public List<Entry> findAllEntries() {
		return null;
	}

}
