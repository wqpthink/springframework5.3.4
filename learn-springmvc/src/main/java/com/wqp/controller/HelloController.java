package com.wqp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(String name){
		System.out.println("HelloController.hello");
		System.out.println("name = " + name);
		return "success";
	}



}
