package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
{
	@RequestMapping(value = {"","/","/index","home"})
	public String m1()
	{
		return "index";
	}
}
