package com.restservice.demo.Model;

public class Student {
	
	int studId;
	String studentName;
	String studentDOB;
	String studentAddr;
	String studentBloodType;
	
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
