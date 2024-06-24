package com.restservice.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int studId;
	String studentName;
	String studentDOB;
	String studentAddr;
	String studentBloodType;
	String studentEmail;
	
	public Student() {
		super();
	}

	public Student(int studId, String studentName, String studentDOB, String studentAddr, String studentBloodType) {
		super();
		this.studId = studId;
		this.studentName = studentName;
		this.studentDOB = studentDOB;
		this.studentAddr = studentAddr;
		this.studentBloodType = studentBloodType;
	}
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}
	public String getStudentAddr() {
		return studentAddr;
	}
	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}
	public String getStudentBloodType() {
		return studentBloodType;
	}
	public void setStudentBloodType(String studentBloodType) {
		this.studentBloodType = studentBloodType;
	}
	
	

}
