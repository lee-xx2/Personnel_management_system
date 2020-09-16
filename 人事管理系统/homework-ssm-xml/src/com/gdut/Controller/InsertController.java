package com.gdut.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.Login;
import com.gdut.service.IPersonService;

public class InsertController implements Controller {
	private IPersonService service;

	public void setService(IPersonService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mView = new ModelAndView();
		if (request.getParameter("firstPassword").equals(request.getParameter("secondPassword"))) {

			Login login = new Login(request.getParameter("name"), request.getParameter("accound"),
					request.getParameter("firstPassword"));

			int rs = service.insertLogin(login);
			System.out.println(rs);
			if (rs == 1) {
				mView.setViewName("login.jsp");
				mView.addObject("message","注册成功！");
				return mView;
			} else {
				mView.setViewName("register.jsp");
				mView.addObject("message","注册失败，请重试！");
				return mView;
			}
		} else {
			mView.setViewName("register.jsp");
			mView.addObject("message","两次密码不一致！");
			/*out.println("<script language = javascript>alert('两次密码输入不一致')");*/
			return mView;
		}
	}
}
