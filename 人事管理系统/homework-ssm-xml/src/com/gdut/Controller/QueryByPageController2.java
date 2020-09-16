package com.gdut.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.Page;
import com.gdut.beans.job_seeker;
import com.gdut.beans.wages;
import com.gdut.service.IJobSeekService;
import com.gdut.service.IWagesService;

public class QueryByPageController2 implements Controller{
private IWagesService service;
	
	public void setService(IWagesService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("/manageMoney.jsp");
		HttpSession session = request.getSession();
		if(request.getParameter("ename")!=null){
			session.setAttribute("w",request.getParameter("ename"));
		}
		String w=(String)session.getAttribute("w");
		Page page= new Page();
		String cPage = request.getParameter("currentPage");
	     if(cPage == null) {//处理首次进入
	    	cPage="0";
	     }
	     int currentPage=Integer.parseInt(cPage);
	     page.setCurrentPage(currentPage);
		 int totalCount = service.getTotalCount(w);
		 page.setTotalCount(totalCount);
		 if(request.getParameter("pagesize")!=null) {
	    	 session.setAttribute("pagesize",Integer.parseInt(request.getParameter("pagesize")));
	     }
		 int pageSize=(Integer)session.getAttribute("pagesize");
	     page.setPageSize(pageSize);
	     List<wages> wgs = service.queryByPage(w,currentPage*pageSize,pageSize);
	     page.setWgs(wgs);
	     response.setContentType("text/jsp;charset=UTF-8");
		mv.addObject("p",page);
		mv.addObject("ename",w);
		return mv;
	}
}
