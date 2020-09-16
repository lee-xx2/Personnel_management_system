package com.gdut.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.Admin;
import com.gdut.beans.Login;
import com.gdut.service.IAdminService;
import com.gdut.service.IPersonService;

import sun.print.resources.serviceui;

public class LoginController implements Controller {

	private IPersonService service;
	private IAdminService service2;

	public void setService(IPersonService service) {
		this.service = service;
	}

	public void setService2(IAdminService service2) {
		this.service2 = service2;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String radioResult = request.getParameter("radiol");
		System.out.println(radioResult);
		String accound = request.getParameter("accound");
		String password = request.getParameter("password");

		if (radioResult.equals("0")) {// 管理员
			Admin admin = new Admin(accound, password);
			Admin admin2 = null;
			admin2 = service2.queryAdmin(admin);
			String reason = "";
			if (admin2 != null) {
				if (admin2.getPassword().equals(password)) {
					// 给session赋值
					HttpSession session = request.getSession();
					session.setAttribute("name", admin2.getName());
					session.setAttribute("accound", admin2.getAccound());
					session.setAttribute("password", admin2.getPassword());

					Cookie cookie1 = new Cookie("accound", admin2.getAccound());
					Cookie cookie2 = new Cookie("password", admin2.getPassword());
					response.addCookie(cookie1);
					response.addCookie(cookie2);
					cookie1.setMaxAge(60 * 60);
					cookie2.setMaxAge(60 * 60);
					return new ModelAndView("/login_success2.jsp");
				}
				reason = "账户或密码不正确！";
				request.setAttribute("reason", reason);
				return new ModelAndView("/login_failure.jsp");
			} else {
				reason = "账号不存在，请注册！";
				request.setAttribute("reason", reason);
				return new ModelAndView("/login_failure.jsp");
			}
		} else {
			Login login = new Login(accound, password);
			login.toString();
			Login login2 = null;
			login2 = service.queryLogin(login);// 查询结果
			Logger logger = Logger.getLogger(LoginController.class);
			logger.info(login2);
			String reason = "";
			if (login2 != null) {
				if (login2.getPassword().equals(password)) {
					// 给session赋值
					HttpSession session = request.getSession();
					session.setAttribute("name", login2.getName());
					session.setAttribute("accound", login2.getAccound());
					session.setAttribute("password", login2.getPassword());

					Cookie cookie1 = new Cookie("accound", login2.getAccound());
					Cookie cookie2 = new Cookie("password", login2.getPassword());
					response.addCookie(cookie1);
					response.addCookie(cookie2);
					cookie1.setMaxAge(60 * 60);
					cookie2.setMaxAge(60 * 60);
					return new ModelAndView("/login_success.jsp");
				}
				reason = "账户或密码不正确！";
				request.setAttribute("reason", reason);
				return new ModelAndView("/login_failure.jsp");
			} else {
				reason = "账号不存在，请注册！";
				request.setAttribute("reason", reason);
				return new ModelAndView("/login_failure.jsp");
			}
		}
	}
}
