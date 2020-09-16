package com.gdut.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.service.IAdminService;
import com.gdut.service.IPersonService;

public class Delete1Controller implements Controller {
	private IAdminService service;
	public void setService(IAdminService service) {
		this.service = service;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String accound = request.getParameter("accound");
		int rs = service.deleteAdmin(accound);
		if(rs==1) {
			ModelAndView mv = new ModelAndView("/login.jsp");
			mv.addObject("message","注销成功！");
			return mv;
		}
		return null;
	}

}