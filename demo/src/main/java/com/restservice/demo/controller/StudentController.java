package com.restservice.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.demo.Model.Student;
import com.restservice.demo.exception.StudentNotFoundException;
import com.restservice.demo.exception.studentException;
import com.restservice.demo.response.ResponseHandler;
import com.restservice.demo.service.impl.StudentServiceImpl;

@RestController
@RequestMapping("/v1/studentService")
public class StudentController {
	
	private StudentServiceImpl studentService;
	
	public StudentController(StudentServiceImpl studentService) {
		super();
		this.studentService = studentService;
	}

	@PostMapping("/student")
	public String saveStudentDetails(@RequestBody Student student) throws Exception {
		return studentService.saveStudent(student);
		
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Object> getStudent(@PathVariable String id) throws NumberFormatException, StudentNotFoundException {
		return ResponseHandler.responseBuilder("Student Data", studentService.getStudent(Integer.parseInt(id)));
		
	}
	

}
