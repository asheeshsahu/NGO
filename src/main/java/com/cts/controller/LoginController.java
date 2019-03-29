package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.LoginEntity;
import com.cts.service.LoginService;
import com.cts.service.UserPostService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	LoginService loginService;

	@Autowired
	UserPostService userpostservice;
	@GetMapping
	public String  loginForm()
	{
		
		return "login";
	}
	
	
	@GetMapping("/login")
	public String loginValidation(Model model)
	{
		model.addAttribute("postDetails", userpostservice.showPost());
		
	return "homePage";
	}
	
	

	

}
