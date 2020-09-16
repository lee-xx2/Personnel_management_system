package com.gdut.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.job_seeker;
import com.gdut.beans.wages;
import com.gdut.service.IWagesService;

public class AddwgController implements Controller{
	private IWagesService service;	
	public void setService(IWagesService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		String department = request.getParameter("department");
		String name =request.getParameter("name");
		String biaozhun = request.getParameter("biaozhun");
		String ticheng = request.getParameter("ticheng");
		String yingfa =request.getParameter("yingfa");
		String koushui = request.getParameter("koushui");
		String shifa = request.getParameter("shifa");
		wages wg = new wages(department, id, name, biaozhun, ticheng, yingfa, koushui, shifa);
		
		int rs = service.insertwages(wg);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageMoney.jsp");
			mv.addObject("message","添加成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/managemanageMoney.jsp");
			mv.addObject("message","添加失败！");
			return mv;
		}
	}
}
