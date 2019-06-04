package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {

	@RequestMapping("/index")
	public String index(HashMap<String, Object> map, Model model) {
		model.addAttribute("hello", "Hello World Spring Boot!");
		//model.addAttribute("say", "try say...");
		map.put("say", "try say!");
		return "index";
	}


}
