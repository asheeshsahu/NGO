package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.UserPostDetails;
import com.cts.service.AdminService;

@Controller
@RequestMapping("/adminhome")
public class AdminController {

	@Autowired
	AdminService adminservice;
	
	
	@GetMapping
	public String adminHome(Model model)
	{
		
		List<UserPostDetails> list  =  adminservice.getPosts();
		model.addAttribute("eventslist",list);
		System.out.println(list);
		return "adminhome";
		
	}
	@GetMapping("/accept")
	public String acceptPost(@RequestParam("title")String title)
	{
		adminservice.acceptPost(title);
		return "redirect:/adminhome";
	}
	
	@PostMapping("/update")
	public String addPost(@ModelAttribute UserPostDetails postdetails)
	{

		adminservice.update(postdetails);
		return "redirect:/adminhome";
	}
	
	
	@GetMapping("/userpostdelete")
	public String deletePostForm(@RequestParam("title") String title)
	{
		adminservice.delete(title);
		return "redirect:/adminhome";
	}
	
	@GetMapping("/userpostupdate")
	public String updateForm(Model model,@RequestParam("title") String title)
	{

		adminservice.getPosts().forEach(item->{
			
			if(item.getTitle().equals(title))
			{
				final UserPostDetails upd=item;
				model.addAttribute("postdetails",upd);
			}
			
		});
		return "updateForm";
	}
	
}
