package com.SpringBootClass.WebMVC3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringBootClass.WebMVC3.dto.UserDto;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@GetMapping("/")
	public String getIndex(Model model) {
		
		UserDto userDto = new UserDto();
		model.addAttribute("user",userDto);
		return "index";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute("user") UserDto user, HttpServletRequest req , Model model) {
		
		String email=user.getEmail();
		String pwd= user.getPwd();
		if(email.equals("admin@gmail.com") && pwd.equals("admin@123")) {
			HttpSession session = req.getSession(true);
			session.setAttribute("email", email);
			return "redirect:dashboard";
		}else {
			model.addAttribute("msg", "Invalid credentials");
			return "index";
		}
		
	}
	@GetMapping("/dashboard")
	public String buildDashboard( HttpServletRequest req ,Model model) {
		
		HttpSession session =req.getSession(false);
		String email = (String) session.getAttribute("email");
		model.addAttribute("email", email);
		return "dashboard";
	}
	@GetMapping("/logout")
	public String logout( HttpServletRequest req ,Model model) {
		
		HttpSession session =req.getSession(false);
		//remove user from session
		session.invalidate();
		return "redirect:/";
	}
	//przw vlva uazh uzxy
}
