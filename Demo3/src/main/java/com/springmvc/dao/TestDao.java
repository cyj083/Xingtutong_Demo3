package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.springmvc.entity.Test_;

@Repository
public class TestDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	//get
	public Test_ get(Long id){
		return hibernateTemplate.get(Test_.class, id);
	}
	
	//load
	public Test_ load(Long id){
		return null;
	}
	
	public void save(Test_ base){
		hibernateTemplate.save(base);
	}
	
	
}
