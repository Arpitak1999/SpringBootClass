package com.SpringBootClass.ExceptionHandler;

import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExHandler {
	
	@ExceptionHandler(exception= Exception.class)
	public ResponseEntity<ExInfo> handleEx(Exception e){
		ExInfo exInfo =new ExInfo();
		exInfo.setExCode("EX00001");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(exception= UserNotFoundException.class)
	public ResponseEntity<ExInfo> handleUserNotFoundEx(UserNotFoundException e){
		ExInfo exInfo =new ExInfo();
		exInfo.setExCode("EX000021");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(exception= SQLException.class)
	public ResponseEntity<ExInfo> handleSQLEX(SQLException e){
		ExInfo exInfo =new ExInfo();
		exInfo.setExCode("EX00002");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
