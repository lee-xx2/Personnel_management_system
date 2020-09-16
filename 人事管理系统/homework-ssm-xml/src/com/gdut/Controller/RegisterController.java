package com.gdut.Controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.service.IPersonService;

import sun.print.resources.serviceui_zh_CN;

public class RegisterController implements Controller {
	private IPersonService service;
	
	public void setService(IPersonService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/xml;charset=utf-8");
		response.setHeader("Cache-Control","no-cache");
		String message = "";
		String accound = request.getParameter("accound");
		int rs = service.queryByAccound(accound);
		if(rs>0) {
			message="该账号已存在";
			
		}else {
			message="该账号可使用";
		}
		PrintWriter out = response.getWriter();
		out.println("<response>");
		out.println("<message>"+message+"</message>");
		out.println("</response>");
		out.flush();
		return null;
	}

}
