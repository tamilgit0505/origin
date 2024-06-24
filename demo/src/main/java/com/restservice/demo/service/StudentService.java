package com.restservice.demo.service;

import com.restservice.demo.Model.Student;

public interface StudentService {
	
	public Student getStudent(Integer StudentId) throws Exception;
	public String saveStudent(Student Student) throws Exception;

}
