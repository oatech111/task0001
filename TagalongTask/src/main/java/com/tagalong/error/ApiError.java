package com.tagalong.error;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ApiError extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleError(Exception e, WebRequest req){
		String errormsg=e.getLocalizedMessage();
		if(errormsg==null) errormsg=e.toString();
		
		ErrorMessage em= new ErrorMessage(new Date(),errormsg);
		
		return new ResponseEntity<>(em, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		
	}

}
