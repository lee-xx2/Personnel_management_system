package com.gdut.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.Existing_worksheet;
import com.gdut.beans.Page;
import com.gdut.service.IWorkService;

public class QueryByPageController implements Controller {
	private IWorkService service;
	
	public void setService(IWorkService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("/manageDepartment.jsp");
		HttpSession session = request.getSession();
		if(request.getParameter("work")!=null){
			session.setAttribute("a",request.getParameter("work"));
		}
		String a=(String)session.getAttribute("a");
		Page page= new Page();
		String cPage = request.getParameter("currentPage");
	     if(cPage == null) {//处理首次进入
	    	cPage="0";
	     }
	     int currentPage=Integer.parseInt(cPage);
	     page.setCurrentPage(currentPage);
		 int totalCount = service.getTotalCount(a);
		 page.setTotalCount(totalCount);
		 if(request.getParameter("pagesize")!=null) {
	    	 session.setAttribute("pagesize",Integer.parseInt(request.getParameter("pagesize")));
	     }
		 int pageSize=(Integer)session.getAttribute("pagesize");
	     page.setPageSize(pageSize);
	     List<Existing_worksheet> ews = service.queryByPage(a,currentPage*pageSize,pageSize);
	     page.setEws(ews);
	     response.setContentType("text/jsp;charset=UTF-8");
		mv.addObject("p",page);
		mv.addObject("work",a);
		return mv;
	}

}








