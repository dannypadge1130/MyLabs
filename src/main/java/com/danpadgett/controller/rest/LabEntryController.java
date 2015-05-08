package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.BlogEntry;
import com.danpadgett.model.LabEntry;
import com.danpadgett.service.entry.LabEntryService;

@RestController
public class LabEntryController {

	@Autowired
	LabEntryService labService;
	
	@RequestMapping(value="/api/labs", method=RequestMethod.GET) 
	public List<LabEntry> getAllLabs() {
		return labService.findAllLabEntries();
	}
	
	@RequestMapping(value="/api/lab/{labId}", method=RequestMethod.GET)
	public LabEntry getLab(@PathVariable String labId) {
		return labService.findLabEntry(labId);
	}
	
	@RequestMapping(value="/api/admin/lab/{labId}", method=RequestMethod.DELETE)
	public void deleteLab(@PathVariable String labId) {
		labService.deleteLabEntry(labId);
	}
	
	@RequestMapping(value="/api/admin/lab/{labId}", method = RequestMethod.PUT)
	public LabEntry updateLabEntry(@PathVariable String labId, @RequestBody LabEntry lab) {
		return labService.updateLabEntry(labId, lab);
	}
}
