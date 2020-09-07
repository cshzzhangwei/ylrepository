package com.hz.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello/api/v_1.0")
public class HelloBootController {
	@RequestMapping("/findHello")
	public  String  findHello(){
		System.out.println("hello  boot");
		return "redirect:/index.jsp";
	}

}
