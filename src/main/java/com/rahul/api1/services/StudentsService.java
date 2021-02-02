package com.rahul.api1.services;

import java.util.List;

import com.rahul.api1.entities.Students;

public interface StudentsService {

	//public List<Students> getStudents();
	public List<Object> getStudents();
	public Students getStudent(int studId);
}
