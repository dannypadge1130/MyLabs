package com.danpadgett.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.LabEntry;

@Repository("labEntryDao")
public class LabEntryDaoImpl extends AbstractDao<Long, LabEntry> implements LabEntryDao {

	@Override
	public LabEntry findById(long id) {
		return getByKey(id);
	}

	@Override
	public void saveLabEntry(LabEntry lab) {
		persist(lab);
	}

	@Override
	public void deleteLabEntry(long id) {
		Query query = getSession().createSQLQuery("delete from LabEntry where id = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LabEntry> findAllLabEntries() {
		Criteria criteria = createEntityCriteria();
		return (List<LabEntry>) criteria.list();
	}

}
