package com.springmvc.service;

import com.springmvc.dao.LoginLogDao;
import com.springmvc.dao.UserDao;
import com.springmvc.entity.LoginLog;
import com.springmvc.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	@Autowired
	LoginLogDao loginLogDao;
		
    public User findUserByUserName(String userName) {
        User user  = userDao.getUserByUserName(userName);
        if(user==null)
            return null;
        else
        	return user;
    }
    
    public void updateUserInfo(User user){
    	userDao.update(user);
    }
    
    public void saveLoginInfo(User user) {
        LoginLog loginLog = new LoginLog();
        loginLog.setUser(user);
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginTime(user.getLastVisit());
        loginLogDao.save(loginLog);
    }

}
