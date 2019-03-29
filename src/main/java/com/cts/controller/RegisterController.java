package com.cts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.entity.LoginEntity;
import com.cts.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired  
	RegisterService registerService;
	
	@GetMapping("userform")
	public String registerUserForm(Model model)
	{
		LoginEntity loginEntity=new LoginEntity();
		model.addAttribute("userregister",loginEntity);
		return "userregisterform";
	}
	
	@PostMapping("usersave")
	public String registerUser(Model mode,@ModelAttribute LoginEntity loginEntity)
	{
		System.out.println(loginEntity);
		loginEntity.setPassword(new BCryptPasswordEncoder().encode(loginEntity.getPassword()));
		
		boolean registerUser = registerService.registerUser(loginEntity);
		System.out.println(registerUser);
		return "redirect:/";
	}
	
	@GetMapping("ngoform")
	public String registerngoForm(Model model)
	{
		LoginEntity loginEntity=new LoginEntity();
		model.addAttribute("userregister",loginEntity);
		return "ngoregister";
	}
}
