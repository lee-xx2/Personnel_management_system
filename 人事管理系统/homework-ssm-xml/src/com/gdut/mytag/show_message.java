package com.gdut.mytag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gdut.beans.Existing_worksheet;
import com.gdut.service.IExistService;




public class show_message extends SimpleTagSupport  implements Controller {
	String no;
	String depart_name;
	String work_type;
	int now_number;
	String work;
	int remain_number;
	IExistService service;
	Existing_worksheet ew;
	
	public void setEw(Existing_worksheet ew) {
		this.ew = ew;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}

	public void setWork_type(String work_type) {
		this.work_type = work_type;
	}

	public void setNow_number(int now_number) {
		this.now_number = now_number;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void setRemain_number(int remain_number) {
		this.remain_number = remain_number;
	}

	public void setno(String no) {
		this.no=no;
	}
	
	public void setService(IExistService service) {
		this.service = service;
	}


	public void doTag() throws JspException,IOException{
		JspWriter out = getJspContext().getOut();
		out.println("编号"+no+"------");
		out.println("部门"+depart_name+"------");
		out.println("工作类型"+work_type+"------");
		out.println("现在人数"+now_number+"------");
		out.println("工作内容"+work+"------");
		out.println("可容纳人数"+remain_number+"------");
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int wno = Integer.parseInt((String) request.getParameter("no"));
		Existing_worksheet ew =service.queryMessage(wno);
		ModelAndView mv = new ModelAndView("show_message.jsp");
		mv.addObject("no",request.getParameter("no"));
		mv.addObject("ew",ew);
		return mv;
	}

}
















