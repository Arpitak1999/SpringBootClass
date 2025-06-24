package com.SpringBootClass.WebMVC2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringBootClass.WebMVC2.dto.UserDto;
import com.SpringBootClass.WebMVC2.service.EmailService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	private EmailService emailService;
	@GetMapping("/")
	public String index(@ModelAttribute("user") UserDto user, Model model) {
		//model.addAttribute("user",new UserDto());
		return "index";
		
	}
	@PostMapping("/user-submit")
	//@ResponseBody
	//public String handleSubmit(UserDto user) {
	public String handleSubmit(@Valid @ModelAttribute("user") UserDto user, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		
		String subject = "Regitration Successful";
		String body= "<h1>Welcome to the page</h1> <br/> <h3>Your Account was created.. </h3>";
		
		boolean sendEmail =  emailService.sendEmail(user.getEmail(), subject, body);
		if(sendEmail) {
		model.addAttribute("msg", "User Form is submitted and Email sent");
		}
		//return "Form Submitted ";
		return "index";
	}

}
