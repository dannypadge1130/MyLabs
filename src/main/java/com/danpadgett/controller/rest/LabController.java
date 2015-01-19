package com.danpadgett.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danpadgett.model.Lab;
import com.danpadgett.service.LabService;

@RestController
public class LabController {

	@Autowired
	LabService labService;
	
	@RequestMapping(value="/api/labs", method=RequestMethod.GET) 
	public List<Lab> getAllLabs() {
		return labService.findAllLabs();
	}
}
