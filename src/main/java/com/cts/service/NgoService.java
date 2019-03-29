package com.cts.service;

import java.util.List;

import com.cts.entity.UserPostDetails;

public interface NgoService {
	List<UserPostDetails>getPosts();
	boolean subscribePost(String title);
	boolean update(UserPostDetails userPostDetails);
	boolean delete(String title);
}
