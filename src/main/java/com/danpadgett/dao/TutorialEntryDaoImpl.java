package com.danpadgett.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.TutorialEntry;

@Repository("tutorialEntryDao")
public class TutorialEntryDaoImpl extends AbstractDao<Long, TutorialEntry> implements TutorialEntryDao {

	@Override
	public TutorialEntry findById(long id) {
		return getByKey(id);
	}

	@Override
	public void saveTutorialEntry(TutorialEntry tutorial) {
		persist(tutorial);
	}

	@Override
	public void deleteTutorialEntry(long id) {
		Query query = getSession().createSQLQuery("delete from TutorialEntry where id = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TutorialEntry> findAllTutorialEntries() {
		Criteria criteria = createEntityCriteria();
		return (List<TutorialEntry>) criteria.list();
	}

}
