package com.springmvc.web;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.springmvc.service.UserService;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springmvc.entity.User;

@Controller
@RequestMapping("/user")
public class UserController{
	
	private static final Log log =  LogFactory.getLog(UserController.class);
	
	@Autowired
	private UserService userService;
	
	
	/*
	 * 登录验证
	 */
	@ResponseBody
    @RequestMapping(value="/loginCheck.html",method=RequestMethod.GET)
	public JSONObject loginCheck(HttpServletRequest request,@RequestParam String userName,@RequestParam String password) {
		
		User user = userService.findUserByUserName(userName);
		
		JSONObject jsonObj = new JSONObject();
		if (user == null) {
			jsonObj.put("msg", "用户名不存在");
		} else if (!user.getPassword().equals(password)) {
			jsonObj.put("msg", "登录密码错误");
		} else {
			jsonObj.put("msg", "登录成功");
            user.setLastIp(request.getLocalAddr());
            user.setLastVisit(new Date());
            userService.saveLoginInfo(user);
            
            request.getSession().setAttribute("user", userName);
		}
		
		log.info("user login check " +  userName + " " + password);
		
		return jsonObj;
	}
	

	/*
	 * 登录注销
	 */
    @RequestMapping("/doLogout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "index";
    }
}
