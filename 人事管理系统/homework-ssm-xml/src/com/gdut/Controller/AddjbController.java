package com.gdut.Controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.job_seeker;
import com.gdut.service.IJobSeekService;
import com.gdut.service.IPersonService;

public class AddjbController implements Controller{
private IJobSeekService service;
	
	public void setService(IJobSeekService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age =  Integer.parseInt(request.getParameter("age"));
		
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String career = request.getParameter("career");
		job_seeker jb = new job_seeker(id,name,age,sex,major,career);
		
		int rs = service.insertjobseeker(jb);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageEemployees.jsp");
			mv.addObject("message","添加成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageEemployees.jsp");
			mv.addObject("message","添加失败！");
			return mv;
		}
	}
}
