package com.gdut.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.job_seeker;
import com.gdut.service.IJobSeekService;

public class NewController implements Controller {
	private IJobSeekService service;
	
	
	public void setService(IJobSeekService service) {
		this.service = service;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		List<job_seeker> job_seekers =  service.queryAll();
		session.setAttribute("jobSeekerList", job_seekers);
		return new ModelAndView("workerShow.jsp");
	}

}













