package com.springmvc.dao;

import com.springmvc.entity.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginLogDao{
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public void save(LoginLog loginLog){
		hibernateTemplate.save(loginLog);
	}

}