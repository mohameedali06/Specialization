package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String dem()
	{
		return "index.jsp";
	}
	
	
	@RequestMapping("/print")
	public String demo(HttpServletRequest req)
	{
		String name=req.getParameter("name");
		System.out.println(name);
		return "index.jsp";
	}
	
}
