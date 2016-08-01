package com.springmvc.dao;

import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.springmvc.entity.Test_;

@TransactionConfiguration(transactionManager="txManager",defaultRollback=true)
@Transactional 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestDao_Test extends AbstractJUnit4SpringContextTests{

	@Autowired
	TestDao testDao;
	
	@Test
	public void getTest(){
		Test_ test = testDao.get(1L);
		System.out.println(test.toString());
	}
	
	@Test
	public void loadTest(){
		Test_ test = testDao.load(1L);
		System.out.println(test.toString());
	}
	
	@Test
	public void findTest(){
		List<Test_> list = testDao.find();
		for(Test_ t:list){
			System.out.println(t.toString());
		}
	}
	
	@Test
	public void iterateTest(){
		Iterator<Test_> iterator = testDao.iterate();
		while(iterator.hasNext()){
			System.out.println("1");
			iterator.next();
		}
	}
	
	@Test
	public void saveTest(){
		Test_ test = new Test_();
		//test.setId(7);
		//设置了id，在插入的时候也会按照identity方式自动生成
		test.setString("e");
		test.setNumber(15);
		
		testDao.save(test);
	}
	
	@Test
	public void updateTest(){
		Test_ test = new Test_();
		test.setId(1);
		test.setString("asd");
		test.setNumber(111);
		testDao.update(test);
	}
	
	@Test
	public void saveOrUpdateTest(){
		Test_ test = new Test_();
		//不设置id，则直接插入数据库
		//设置id，若数据库中存在该id对应的数据，则更新；若不存在，则报错
		test.setId(6);
		test.setString("f");
		test.setNumber(6);
		testDao.savaOrUpdate(test);
	}
	
	@Test
	public void deleteTest(){
		//只需要设置id，其它会被忽略
		Test_ test = new Test_();
		test.setId(8);
		test.setNumber(1);
		test.setString("h");
		testDao.delete(test);
	}
	
	@Test
	public void bulkUpdateTest(){
		testDao.bulkUpdate();
	}
	
	@Test
	public void sqlQueryTest(){
		List<Test_> list = testDao.sqlQuery();
		for(Test_ t:list){
			System.out.println(t.toString());
		}
	}
	
	@Test
	public void sqlDeleteTest(){
		testDao.slqDelete("g", 1);
	}
	
}
