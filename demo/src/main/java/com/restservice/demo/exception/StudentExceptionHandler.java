package com.restservice.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler{
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<Object> studentNotFound(StudentNotFoundException e){
		
		studentException ex = new studentException();
		ex.setErrMsg(e.getMessage());
		//ex.setThrowable(e.getCause());
		ex.setHttpstatus(HttpStatus.NOT_FOUND);
		ex.setTimestamp(new Date().toString());
		
		return new ResponseEntity<>(ex,HttpStatus.NOT_FOUND);
		
	}

}
