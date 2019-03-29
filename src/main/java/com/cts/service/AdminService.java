package com.cts.service;

import java.util.List;

import com.cts.entity.UserPostDetails;

public interface AdminService {
	
	List<UserPostDetails>getPosts();
	boolean acceptPost(String title);
	boolean update(UserPostDetails userPostDetails);
	boolean delete(String title);

}
