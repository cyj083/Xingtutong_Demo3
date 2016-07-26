package com.springmvc.dao;

import java.util.List;
import com.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")

@Repository
public class UserDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	public User getUserByUserName(String userName){
		String hql = "from User u where u.userName=?";
		List<User> users = hibernateTemplate.find(hql,userName);
        if (users.size() == 0) {
            return null;
        }else{
            return users.get(0);
        }
    }
	
	public void update(User user){
		hibernateTemplate.update(user);
	}

	public List<User> queryUserByUserName(String userName){
    	String hql = "from User u where u.userName like ?";
        return (List<User>)hibernateTemplate.find(hql,userName+"%");
    }
}
