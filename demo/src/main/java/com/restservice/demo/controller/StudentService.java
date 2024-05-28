package com.restservice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.demo.Model.Student;

@RestController
@RequestMapping("/v1/studentService")
public class StudentService {
	
	private Student student;
	
	@PostMapping("/student")
	public String saveStudentDetails(@RequestBody Student student) {
		this.student = student;
		return "Student Details Store Successfully";
		
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable String id) {
		System.out.print(id);
		return student;
		
	}
	

}
