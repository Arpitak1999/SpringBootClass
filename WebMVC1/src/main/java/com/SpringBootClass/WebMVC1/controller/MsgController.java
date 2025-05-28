package com.SpringBootClass.WebMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning !");
		mav.setViewName("index");
		return mav;
	}
}
