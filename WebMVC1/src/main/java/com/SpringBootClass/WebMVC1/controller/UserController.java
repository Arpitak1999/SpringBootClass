package com.SpringBootClass.WebMVC1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

@GetMapping("/info")	
	public ModelAndView getUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "My Name is ak");
		mav.setViewName("index");
		return mav;
	}
}
