package com.rahul.api1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.api1.entities.Students;
import com.rahul.api1.services.StudentsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	StudentsService studService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/students")
	public List getStudents(){
		
		return this.studService.getStudents();
	}
	
	@GetMapping("/student/{studId}")
	public Students getStudent(@PathVariable int studId){
		
		return this.studService.getStudent(studId);
	}
	
}
