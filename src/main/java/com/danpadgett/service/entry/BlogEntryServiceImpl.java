package com.danpadgett.service.entry;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.repository.BlogEntryRepository;

@Service
public class BlogEntryServiceImpl implements BlogEntryService {

	@Autowired
	private BlogEntryRepository blogEntryRepository;
	
	public List<BlogEntry> findAllBlogEntries() {
		return blogEntryRepository.findAll();
	}

	public BlogEntry findBlogEntry(long blogEntryId) {
		return blogEntryRepository.findOne(blogEntryId);
	}

	public void deleteBlogEntry(long blogEntryId) {
		blogEntryRepository.delete(blogEntryId);
	}

	public void deleteBlogEntry(BlogEntry blogEntry) {
		blogEntryRepository.delete(blogEntry);
	}

	public void deleteBlogEntries(Set<BlogEntry> blogEntries) {
		blogEntryRepository.delete(blogEntries);
	}
	
}
