package com.infy.controller;

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

import com.infy.dao.EmployeeRepository;
import com.infy.entity.Employee;

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
	EmployeeRepository employeeRepository;

	@GetMapping("/getEmployeebyId")
	public List<Employee> getProduct(@RequestParam(value = "id", defaultValue = "") Long id) {
		try {
			List<Employee> l = employeeRepository.findByid(id);
			return l;
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addProduct(@RequestBody Employee employee) {
		try {
			employeeRepository.save(employee);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Employee>(employee, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/deleteEmployee")
	public ResponseEntity<Employee> deleteProduct(@RequestBody Employee employee) {
		try {
			employeeRepository.delete(employee);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Employee>(employee, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}