package com.cts.dao;

import java.util.List;

import com.cts.entity.UserPostDetails;

public interface UserPostDao {
	
	public List<UserPostDetails> showPost();
	boolean addPost(UserPostDetails postDetails);
	boolean deletePost(String title);
}
