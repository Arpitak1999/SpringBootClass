package com.SpringBootClass.WebMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class MsgController {

	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning !");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to page");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/test")
	public String testMsg(Model model) {
		System.out.println(model.getClass().getName());//org.springframework.validation.support.BindingAwareModelMap
		model.addAttribute("msg", "Test another way");
		return "index";
	}
}
