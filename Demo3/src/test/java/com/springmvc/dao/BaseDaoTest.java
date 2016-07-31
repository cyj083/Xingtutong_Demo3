package com.springmvc.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springmvc.entity.Test_;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseDaoTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	TestDao testDao;
	
	@Test
	public void saveTest(){
		Test_ test = new Test_();
		test.setString("e");
		test.setNumber(15);
		
		testDao.save(test);
	}
	
	@Test
	public void getByIdTest(){
		Test_ test = testDao.get(2L);
		System.out.println(test.getString());
	}
	
}
