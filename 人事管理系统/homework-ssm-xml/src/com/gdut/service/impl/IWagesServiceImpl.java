package com.gdut.service.impl;

import java.util.List;

import com.gdut.beans.job_seeker;
import com.gdut.beans.wages;
import com.gdut.dao.IJobSeekDao;
import com.gdut.dao.IWagesDao;
import com.gdut.service.IJobSeekService;
import com.gdut.service.IWagesService;

public class IWagesServiceImpl implements IWagesService{
	private IWagesDao dao;
	
	
	public void setDao(IWagesDao dao) {
		this.dao = dao;
	}


	@Override
	public List<wages> queryAll() {
		// TODO 自动生成的方法存根
		return dao.queryAll();
	}


	@Override
	public int getTotalCount(String a) {
		// TODO 自动生成的方法存根
		return dao.getTotalCount(a);
	}


	@Override
	public List<wages> queryByPage(String a, int currentPage, int pageSize) {
		// TODO 自动生成的方法存根
		return dao.queryByPage(a, currentPage, pageSize);
	}


	@Override
	public int xiugai(int id, String department, String name, String biaozhun, String ticheng, String yingfa,
			String koushui, String shifa) {
		// TODO 自动生成的方法存根
		return dao.xiugai(id, department, name, biaozhun, ticheng, yingfa, koushui, shifa);
	}


	@Override
	public int shanchu(int id) {
		// TODO 自动生成的方法存根
		return dao.shanchu(id);
	}


	@Override
	public wages queryMessage(int id) {
		// TODO 自动生成的方法存根
		return dao.queryMessage(id);
	}


	@Override
	public int insertwages(wages wg) {
		// TODO 自动生成的方法存根
		return dao.insertwages(wg);
	}
	

}
