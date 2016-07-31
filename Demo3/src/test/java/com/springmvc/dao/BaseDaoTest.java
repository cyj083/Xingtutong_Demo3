package com.springmvc.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.springmvc.entity.Base;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/config/applicationContext.xml"})
public class BaseDaoTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	BaseDao baseDao;
	
	@Test
	public void saveTest(){
		Base base = new Base();
		base.setString("e");
		base.setNumber(15);
		
		baseDao.save(base);
	}
	
	
}
