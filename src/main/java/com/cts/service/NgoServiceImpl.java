package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.NgoDAO;
import com.cts.entity.UserPostDetails;

@Service("ngoservice")
public class NgoServiceImpl implements NgoService {

	@Autowired
	NgoDAO ngoDao;
	
	@Transactional
	@Override
	public List<UserPostDetails> getPosts() {
		return ngoDao.showPost();
	}

	@Transactional
	@Override
	public boolean subscribePost(String title) {
		return ngoDao.subscribePost(title);
		}

	@Transactional
	@Override
	public boolean update(UserPostDetails userPostDetails) {
		return  ngoDao.updatePost(userPostDetails);

	}

	@Transactional
	@Override
	public boolean delete(String title) {
		// TODO Auto-generated method stub
		return ngoDao.deletePost(title);
	}

}
