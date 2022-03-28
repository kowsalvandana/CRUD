package com.sree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sree.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	

}
