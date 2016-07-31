package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.springmvc.entity.Base;

@Repository
public class BaseDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public void save(Base base){
		hibernateTemplate.save(base);
	}
	
}
