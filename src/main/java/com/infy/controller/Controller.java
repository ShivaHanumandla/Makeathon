package com.infy.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dao.BCMSRepository;
import com.infy.dao.ResourceRepository;
import com.infy.entity.BCMS;
import com.infy.entity.Resources;

@RestController

public class Controller {
	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!";
	}

	@RequestMapping("/try")
	public String try_() {
		return "I'm trying";
	}

	@Autowired
	BCMSRepository BCMSRepository;
	@Autowired
	ResourceRepository resourceRepository;

	@GetMapping("/getProjectId")
	public List<BCMS> getProject(@RequestParam(value = "id", defaultValue = "") Long id) {
		try {
			List<BCMS> l = BCMSRepository.findByid(id);
			return l;
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	@GetMapping("/getAllProjectId")
	public List<Long> getProject() {
		try {
			List<Long> l = BCMSRepository.getAllIds();
			return l;
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	@PostMapping("/addProject")
	public ResponseEntity<BCMS> addProduct(@RequestBody BCMS bcms) {
		try {
			BCMSRepository.save(bcms);
			return new ResponseEntity<BCMS>(bcms, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<BCMS>(bcms, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/addResource")
	public ResponseEntity<List<Resources>> addProduct(@RequestBody List<Resources> resources) {
		try {
			resourceRepository.saveAll(resources);
			return new ResponseEntity<List<Resources>>(resources, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Resources>>(resources, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/deleteProject")
	public ResponseEntity<BCMS> deleteProduct(@RequestBody BCMS bcms) {
		try {
			BCMSRepository.delete(bcms);
			return new ResponseEntity<BCMS>(bcms, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<BCMS>(bcms, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<BCMS>> findProduct() {
		List<BCMS> bcms = null;
		try {
			bcms=(List<BCMS>) BCMSRepository.findAll();		
			return new ResponseEntity<List<BCMS>>(bcms,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<BCMS>>(bcms, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}