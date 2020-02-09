package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController 
{
	@RequestMapping("/")
	public String m1()
	{
		return "employee";
	}
	
	@RequestMapping("/details")
	public String m2()
	{
		return "employees";
	}
	
	@RequestMapping("/add")
	public String m3()
	{
		return "addemployee";
	}
	
	@RequestMapping("/delete")
	public String m4()
	{
		return "deleteemployee";
	}
	
	@RequestMapping("/update")
	public String m5()
	{
		return "updateemployee";
	}
	
	
}
