package com.gdut.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class OutLoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			cookie.setMaxAge(0);
		}
		session.invalidate();
		return new ModelAndView("/login.jsp");
	}

}
