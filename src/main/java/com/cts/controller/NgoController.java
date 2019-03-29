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
import com.cts.service.NgoService;

@Controller
@RequestMapping("/homengo")
public class NgoController {

	@Autowired
	NgoService ngoService;
	
	@GetMapping
	public String getEvents(Model model)
	{
		List<UserPostDetails> posts = ngoService.getPosts();
		System.out.println("NGO"+posts);
		model.addAttribute("eventslist",posts);
		return "ngohome";
	}
	
	@GetMapping("/subscribe")
	public String subscribePost(@RequestParam("title")String title)
	{
		ngoService.subscribePost(title);
		return "redirect:/homengo";
	}
	
	@PostMapping("/update")
	public String addPost(@ModelAttribute UserPostDetails postdetails)
	{

		ngoService.update(postdetails);
		return "redirect:/homengo";
	}
	
	
	@GetMapping("/userpostdelete")
	public String deletePostForm(@RequestParam("title") String title)
	{
		ngoService.delete(title);
		return "redirect:/homengo";
	}
	
	@GetMapping("/userpostupdate")
	public String updateForm(Model model,@RequestParam("title") String title)
	{

		ngoService.getPosts().forEach(item->{
			
			if(item.getTitle().equals(title))
			{
				final UserPostDetails upd=item;
				model.addAttribute("postdetails",upd);
			}
			
		});
		return "updateForm";
	}
	
}
