package com.example.EmolyeeService.advice;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {
		Map<String, String> errorMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;

	}

	/*
	 * @ExceptionHandler(ConstraintViolationException.class) public String
	 * handleInvalidArguments(ConstraintViolationException ex){
	 * 
	 * Map<String, String> errorMap=new HashMap<>();
	 * ex.getBindingResult().getFieldErrors().forEach(error ->{
	 * errorMap.put(error.getField(),error.getDefaultMessage()); });
	 * 
	 * return "invalid number";
	 * 
	 * }
	 */

}
