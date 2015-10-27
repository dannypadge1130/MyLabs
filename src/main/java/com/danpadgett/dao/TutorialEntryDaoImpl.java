package com.danpadgett.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import com.danpadgett.model.TutorialEntry;

public class TutorialEntryDaoImpl extends AbstractDao<Integer, TutorialEntry> implements TutorialEntryDao {

	@Override
	public TutorialEntry findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveTutorialEntry(TutorialEntry tutorial) {
		persist(tutorial);
	}

	@Override
	public void deleteTutorialEntry(int id) {
		Query query = getSession().createSQLQuery("delete from TutorialEntry where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TutorialEntry> findAllTutorialEntries() {
		Criteria criteria = createEntityCriteria();
		return (List<TutorialEntry>) criteria.list();
	}

}
