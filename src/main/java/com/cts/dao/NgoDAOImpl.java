package com.cts.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.UserPostDetails;


@Repository("ngodao")
public class NgoDAOImpl  implements NgoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<UserPostDetails> showPost() {
		// TODO Auto-generated method stub
		Session session  = sessionFactory.getCurrentSession();
		Query query  = session.createQuery("from UserPostDetails");
		List<UserPostDetails> resultList = query.getResultList();
		
		System.out.println(resultList);
		return resultList;
	}



	@Override
	public boolean deletePost(String title) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			UserPostDetails load = session.load(UserPostDetails.class, title);
			session.delete(load);
		
			session.flush();
		}catch (Exception e) {return false;}
			return true;
	}

	@Override
	public boolean subscribePost(String title) {
		Session session=sessionFactory.getCurrentSession();
		UserPostDetails load = session.load(UserPostDetails.class, title);
		load.setStatus(2);
		session.saveOrUpdate(load);
		return true;
	}

	@Override
	public boolean updatePost(UserPostDetails postDetails) {
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(postDetails);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
