package com.restservice.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.restservice.demo.Model.Student;

public interface StudentRepo extends CrudRepository<Student,Integer>{

}
