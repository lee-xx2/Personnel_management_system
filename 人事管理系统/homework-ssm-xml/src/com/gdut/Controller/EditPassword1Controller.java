package com.gdut.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.service.IAdminService;
import com.gdut.service.IPersonService;

public class EditPassword1Controller implements Controller{
	private IAdminService service;

	public void setService(IAdminService service) {
		this.service = service;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String accound = (String) session.getAttribute("accound");
		String newPassword = request.getParameter("newPassword");
		String verifyPassword = request.getParameter("verifyPassword");
		ModelAndView mv = new ModelAndView();
		if (newPassword.equals(verifyPassword)) {
			int rs = service.updatePassword(accound, newPassword);
			if (rs > 0) {
				mv.setViewName("login.jsp");
				mv.addObject("message", "修改成功，请重新登陆!");
				return mv;
			} else {
				mv.setViewName("editPassword.jsp");
				mv.addObject("message", "修改失败！");
				return mv;
			} 
		}else {
			mv.setViewName("editPassword.jsp");
			mv.addObject("message","两次密码不一致");
			return mv;
		}
	}
}
