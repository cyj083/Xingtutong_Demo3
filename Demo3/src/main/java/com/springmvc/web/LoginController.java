package com.springmvc.web;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.springmvc.entity.User;

@Controller
@RequestMapping("/login")
public class LoginController{
	
	@Autowired
	private UserService userService;
	
	
	/**
	 * 登录
	 * @param request
	 * @param response
	 * @return
	 */
    @RequestMapping("/doLogin")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = userService.findUserByUserName(userName);
		if (user == null) {
			request.setAttribute("errorMsg", "用户名不存在");
			return new ModelAndView("login");
		} else if (!user.getPassword().equals(password)) {
			request.setAttribute("errorMsg", "用户密码不正确");
			return new ModelAndView("login");
		} else {
            user.setLastIp(request.getLocalAddr());
            user.setLastVisit(new Date());
            userService.saveLoginInfo(user);
            
            request.getSession().setAttribute("user", user);
			return new ModelAndView("success");
		}
	}

    /**
     * 登录注销
     * @param session
     * @return
     */
    @RequestMapping("/doLogout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "index";
    }
}
