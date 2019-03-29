package com.cts.dao;

import java.util.List;

import com.cts.entity.UserPostDetails;

public interface AdminDao {
	public List<UserPostDetails> showPost();
	boolean acceptPost(String title);
	boolean updatePost(UserPostDetails postDetails);
	boolean deletePost(String title);
}
