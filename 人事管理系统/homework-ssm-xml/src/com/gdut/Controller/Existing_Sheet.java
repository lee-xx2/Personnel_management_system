package com.gdut.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.gdut.service.IExistService;

public class Existing_Sheet implements Controller {
	private IExistService service;
	
	public void setService(IExistService service) {
		this.service = service;
	}


	public ModelAndView xiugai(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		String department = request.getParameter("department");
		String worktype = request.getParameter("worktype");
		String work = request.getParameter("work");
		int rs = service.xiugai(id, department, worktype, work);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageDepartment.jsp");
			mv.addObject("message","修改成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageDepartment.jsp");
			mv.addObject("message","修改失败！");
			return mv;
		}
		
	}
	
	public ModelAndView shanchu(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String no = request.getParameter("no");
		int rs = service.shanchu(no);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageDepartment.jsp");
			mv.addObject("message","删除成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageDepartment.jsp");
			mv.addObject("message","删除失败！");
			return mv;
		}
		
	}


	
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = request.getRequestURL().toString();
		url = url.substring(url.lastIndexOf("/")+1, url.length());
		System.out.println(url);
		if(url.equals("xiugai.do")) {
			return xiugai(request, response);
		}else if(url.equals("shanchu.do")) {
			return shanchu(request, response);
		}
		return null;
	}


	
}
