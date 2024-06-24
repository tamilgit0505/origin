package com.restservice.demo.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object> responseBuilder(String msg,Object result) {
		
		Map<String,Object> m = new HashMap<>();
		m.put("Message", "Student Data");
		m.put("Data", result);
		
		return new ResponseEntity<>(m,HttpStatus.OK);
		
	}

}
