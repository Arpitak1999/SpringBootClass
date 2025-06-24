package com.SpringBootClass.WebMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

	@GetMapping("/course")
	@ResponseBody //by this we tell dispatcher servlet this is a direct message
	public String getCourseData() {
		String msg="My Classes are Completed";
		return msg;
	}
	
}
