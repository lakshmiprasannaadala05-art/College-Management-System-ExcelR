package com.excelr.CollegeManagementSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")    
	public String hello()
	{
		return "Welcome to Project Session";
	}
	
	@GetMapping("/test")
	public String save student ()
	{
		return "Springboot";
	}
	
}
@Gstmapping("/saveStudent")
	public string saveStudent()
	{
		student s1=new student
			}
			
