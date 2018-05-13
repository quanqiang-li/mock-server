package com.carl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {

	
	@RequestMapping("/")
	public String home(){
		//下面方式不要空格和@RestController
		return "redirect:/html/index.html";
	}
}
