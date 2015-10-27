package com.danpadgett.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.danpadgett.model.BlogEntry;

@Repository("blogDao")
public class BlogEntryDaoImpl extends AbstractDao<Integer, BlogEntry> implements BlogEntryDao {

	@Override
	public BlogEntry findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveBlogEntry(BlogEntry blog) {
		persist(blog);
	}

	@Override
	public void deleteBlogEntry(int id) {
		Query query = getSession().createSQLQuery("delete from BlogEntry where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BlogEntry> findAllBlogEntries() {
		Criteria criteria = createEntityCriteria();
		return (List<BlogEntry>) criteria.list();
	}

}
