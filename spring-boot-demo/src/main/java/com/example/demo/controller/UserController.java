package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	private final UserRepository ur;
	private String name = "test";
	
	@Autowired
	public UserController(UserRepository u) {
		this.ur = u;
	}
	@RequestMapping("/person/save")
	public User save() { //@RequestParam String name) {
		User user = new User();
		user.setUsername(name);
		if(ur.save(user)) {
			System.out.println("saved "+user.toString());			
		}
		
		return user;
	}
	
	 @GetMapping("/index")
	    public String index(){
	        return "home"; //当浏览器输入/index时，会返回 /templates/home.html页面
	    }
	
}
