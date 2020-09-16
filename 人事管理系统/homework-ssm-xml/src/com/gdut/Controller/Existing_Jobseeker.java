package com.gdut.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.service.IExistService;
import com.gdut.service.IJobSeekService;

public class Existing_Jobseeker implements Controller {
	private IJobSeekService service;
	
	public void setService(IJobSeekService service) {
		this.service = service;
	}


	public ModelAndView xiugai(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age =  Integer.parseInt(request.getParameter("age"));
		
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String career = request.getParameter("career");
		
		int rs = service.xiugai(id, name,age,sex,major,career);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageEemployees.jsp");
			mv.addObject("message","修改成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageEemployees.jsp");
			mv.addObject("message","修改失败！");
			return mv;
		}
		
	}
	
	public ModelAndView shanchu(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int rs = service.shanchu(id);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageEemployees.jsp");
			mv.addObject("message","删除成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageEemployees.jsp");
			mv.addObject("message","删除失败！");
			return mv;
		}
		
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = request.getRequestURL().toString();
		url = url.substring(url.lastIndexOf("/")+1, url.length());
		System.out.println(url);
		if(url.equals("xiugai1.do")) {
			return xiugai(request, response);
		}else if(url.equals("shanchu1.do")) {
			return shanchu(request, response);
		}
		return null;
	}
}
