package com.sree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/wel")
	public String wel() {
		return "Welcome";
	}

}
