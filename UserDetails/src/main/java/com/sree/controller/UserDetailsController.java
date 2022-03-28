package com.sree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sree.model.UserDetails;
import com.sree.service.UserDetailsService;

@Controller
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	private UserDetailsService service;
	
	@GetMapping("/reg")
	public String showReg(Model map) {
		map.addAttribute("userdetails",new UserDetails());
		return "test";
	}
	@PostMapping("/save")
public String saveUser(@ModelAttribute UserDetails userdetails,Model map) {
		Integer id=service.saveUserDetails(userdetails);
		map.addAttribute("userdetails",new UserDetails());
		return "test";
	}
}
