package com.restservice.demo.exception;

import org.springframework.http.HttpStatus;

public class studentException{
	
	String errMsg;
	String timestamp;
	Throwable throwable;
	HttpStatus httpstatus;
	
	public studentException(String errMsg, String timestamp,Throwable throwable,
			HttpStatus httpstatus) {
		super();
		this.errMsg = errMsg;
		this.timestamp = timestamp;
		this.throwable = throwable;
		this.httpstatus = httpstatus;

	}

	public studentException() {
		// TODO Auto-generated constructor stub
	}


	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}
	
	

}
