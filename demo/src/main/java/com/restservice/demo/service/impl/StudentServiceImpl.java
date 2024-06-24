package com.restservice.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restservice.demo.Model.Student;
import com.restservice.demo.exception.StudentNotFoundException;
import com.restservice.demo.repo.StudentRepo;
import com.restservice.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public Student getStudent(Integer StudentId) throws StudentNotFoundException {
		if(studentRepo.findById(StudentId).isEmpty()) {
			throw new StudentNotFoundException("StudentNotFOund");
		}
		return studentRepo.findById(StudentId).get();
	}

	@Override
	public String saveStudent(Student Student) throws Exception {
		studentRepo.save(Student);
		return "success";
	}

}
