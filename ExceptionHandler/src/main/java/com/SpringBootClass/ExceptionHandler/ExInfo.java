package com.SpringBootClass.ExceptionHandler;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExInfo {
	
	private String exCode;
	private String exMsg;
	private LocalDateTime exDate;
}
