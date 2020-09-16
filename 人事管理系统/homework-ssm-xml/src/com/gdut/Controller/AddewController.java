package com.gdut.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.Existing_worksheet;
import com.gdut.service.IExistService;

public class AddewController implements Controller {
	private IExistService service;
	
	public void setService(IExistService service) {
		this.service = service;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int no =Integer.parseInt( request.getParameter("id"));
		String depart_name = request.getParameter("department");
		String work_type = request.getParameter("worktype");
		int now_number = Integer.parseInt(request.getParameter("now_number"));
		String work = request.getParameter("work");
		int remain_number = Integer.parseInt(request.getParameter("remain_number"));
		Existing_worksheet ew = new Existing_worksheet(no, depart_name, work_type, now_number, work, remain_number);
		int rs = service.insertew(ew);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageDepartment.jsp");
			mv.addObject("message","添加成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageDepartment.jsp");
			mv.addObject("message","添加失败！");
			return mv;
		}
	}
	
	
}
