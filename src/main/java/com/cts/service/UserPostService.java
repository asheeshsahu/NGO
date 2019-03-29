package com.cts.service;

import java.util.List;

import com.cts.entity.UserPostDetails;

public interface UserPostService {
	
	public List<UserPostDetails> showPost();
	boolean addPost(UserPostDetails userPostDetails);
	boolean deletePost(String title);

}
