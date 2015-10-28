package com.danpadgett.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.service.EntryService;

@RestController
public class EntryController {
	
	@Autowired
	private EntryService entryService;
	
//	@RequestMapping(value="/api/entries", method=RequestMethod.GET)
//	public @ResponseBody List<Entry> getAllEntries() {
//		return entryService.findAllEntry();
//	}
}
