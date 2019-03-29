package com.cts.dao;

import java.util.List;

import com.cts.entity.UserPostDetails;

public interface NgoDAO {
	
	public List<UserPostDetails> showPost();
	boolean subscribePost(String title);
	boolean updatePost(UserPostDetails postDetails);
	boolean deletePost(String title);
}
