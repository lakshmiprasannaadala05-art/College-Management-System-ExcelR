package com.excelr.CollegeManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //return a webpage, which we will see on web browser
public class TeacherControllerFrontEnd {
	
	@GetMapping("/test1")
	public String test()
	{
		String name="Rohit";
		model.addAttribute("playerName",name);
		return "test";
	}
	
	
	@GetMapping("/teacherRegistrationForm")
	public String teacherRegistrationForm()
	{
		return "teacher-registration-form";
	}

}
