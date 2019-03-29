package com.cts.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.UserPostDetails;
import com.cts.service.UserPostService;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	UserPostService postService;
	
	@GetMapping("/addpostform")
	public String addPostForm(Model model)
	{
		UserPostDetails userPostDetails=new UserPostDetails();
		model.addAttribute("postdetails",userPostDetails);
		return "addpostform";
	}
	
	@PostMapping("/add")
	public String addPost(@ModelAttribute UserPostDetails postdetails)
	{
		System.out.println(postdetails);
		postService.addPost(postdetails);
		return "redirect:/login";
	}
	@GetMapping("/userpostdelete")
	public String deletePostForm(@RequestParam("title") String title)
	{
		
		postService.deletePost(title);
		return "homePage";
	}
	
	@GetMapping("/userpostupdate")
	public String updateForm(Model model,@RequestParam("title") String title)
	{

		postService.showPost().forEach(item->{
			
			if(item.getTitle().equals(title))
			{
				final UserPostDetails upd=item;
				model.addAttribute("postdetails",upd);
			}
			
		});
		return "updateForm";
	}
	

}	
