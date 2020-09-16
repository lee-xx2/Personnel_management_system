package com.gdut.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.service.IWagesService;

public class Existing_Wages implements Controller{
	private IWagesService service;	
	public void setService(IWagesService service) {
		this.service = service;
	}
	
	public ModelAndView xiugai(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String department = request.getParameter("department");
		String name =request.getParameter("name");
		String biaozhun = request.getParameter("biaozhun");
		String ticheng = request.getParameter("ticheng");
		String yingfa =request.getParameter("yingfa");
		String koushui = request.getParameter("koushui");
		String shifa = request.getParameter("shifa");
	
		
		int rs = service.xiugai(id, department, name, biaozhun, ticheng, yingfa, koushui, shifa);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageMoney.jsp");
			mv.addObject("message","修改成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageMoney.jsp");
			mv.addObject("message","修改失败！");
			return mv;
		}
		
	}
	
	public ModelAndView shanchu(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int rs = service.shanchu(id);
		if(rs>0) {
			ModelAndView mv = new ModelAndView("/manageMoney.jsp");
			mv.addObject("message","删除成功");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("/manageMoney.jsp");
			mv.addObject("message","删除失败！");
			return mv;
		}
		
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = request.getRequestURL().toString();
		url = url.substring(url.lastIndexOf("/")+1, url.length());
		System.out.println(url);
		if(url.equals("xiugai2.do")) {
			return xiugai(request, response);
		}else if(url.equals("shanchu2.do")) {
			return shanchu(request, response);
		}
		return null;
	}
}
