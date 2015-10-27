package com.danpadgett.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danpadgett.dao.BlogEntryDao;
import com.danpadgett.model.BlogEntry;

@Service("blogEntryService")
@Transactional
public class BlogEntryServiceImpl implements BlogEntryService {

	@Autowired
	private BlogEntryDao dao;
	
	public List<BlogEntry> findAllBlogEntries() {
		return dao.findAllBlogEntries();
	}

	public BlogEntry findBlogEntry(int blogEntryId) {
		return dao.findById(blogEntryId);
	}

	public void deleteBlogEntry(int blogEntryId) {
		dao.deleteBlogEntry(blogEntryId);
	}

	public void updateBlogEntry(int blogEntryId, BlogEntry blogEntry) {
		
		BlogEntry oldBlogEntry = dao.findById(blogEntryId);
		oldBlogEntry.setBannerImageUrl(blogEntry.getBannerImageUrl());
		oldBlogEntry.setBody(blogEntry.getBody());
		oldBlogEntry.setDescription(blogEntry.getDescription());
		oldBlogEntry.setTitle(blogEntry.getTitle());
		oldBlogEntry.setModifiedDate(new Date());

		dao.saveBlogEntry(oldBlogEntry);
	}

	public void createBlogEntry(BlogEntry blogEntry) {
		dao.saveBlogEntry(blogEntry);
	}
	
}
