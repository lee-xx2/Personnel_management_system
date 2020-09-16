package com.gdut.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.Existing_worksheet;
import com.gdut.beans.Page;
import com.gdut.beans.job_seeker;
import com.gdut.service.IJobSeekService;
import com.gdut.service.IWorkService;

public class QueryByPageController1 implements Controller {
	private IJobSeekService service;
	
	public void setService(IJobSeekService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("/manageEemployees.jsp");
		HttpSession session = request.getSession();
		if(request.getParameter("ename")!=null){
			session.setAttribute("e",request.getParameter("ename"));
		}
		String e=(String)session.getAttribute("e");
		Page page= new Page();
		String cPage = request.getParameter("currentPage");
	     if(cPage == null) {//处理首次进入
	    	cPage="0";
	     }
	     int currentPage=Integer.parseInt(cPage);
	     page.setCurrentPage(currentPage);
		 int totalCount = service.getTotalCount(e);
		 page.setTotalCount(totalCount);
		 if(request.getParameter("pagesize")!=null) {
	    	 session.setAttribute("pagesize",Integer.parseInt(request.getParameter("pagesize")));
	     }
		 int pageSize=(Integer)session.getAttribute("pagesize");
	     page.setPageSize(pageSize);
	     List<job_seeker> jbs = service.queryByPage(e,currentPage*pageSize,pageSize);
	     page.setJbs(jbs);
	     response.setContentType("text/jsp;charset=UTF-8");
		mv.addObject("p",page);
		mv.addObject("ename",e);
		return mv;
	}

}

