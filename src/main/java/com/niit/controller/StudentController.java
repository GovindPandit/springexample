package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController
{	
	@RequestMapping("/")
	public String m1()
	{
		return "student";
	}
	
	@RequestMapping("/details")
	public String m2()
	{
		return "students";
	}
}
