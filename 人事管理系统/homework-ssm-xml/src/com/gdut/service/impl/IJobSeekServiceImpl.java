package com.gdut.service.impl;

import java.util.List;

import com.gdut.beans.job_seeker;
import com.gdut.dao.IJobSeekDao;
import com.gdut.service.IJobSeekService;

public class IJobSeekServiceImpl implements IJobSeekService{
	
	private IJobSeekDao dao;
	
	
	public void setDao(IJobSeekDao dao) {
		this.dao = dao;
	}
	@Override
	public List<job_seeker> queryAll() {
		return dao.queryAll();
	}
	@Override
	public int getTotalCount(String e) {
		// TODO 自动生成的方法存根
		return dao.getTotalCount(e);
	}
	@Override
	public List<job_seeker> queryByPage(String e, int currentPage, int pageSize) {
		// TODO 自动生成的方法存根
		return dao.queryByPage(e, currentPage, pageSize);
	}


	


	@Override
	public job_seeker queryMessage(int id) {
		// TODO 自动生成的方法存根
		return dao.queryMessage(id);
	}


	@Override
	public int xiugai(int id, String name, int age, String sex, String major, String career) {
		// TODO 自动生成的方法存根
		return dao.xiugai(id, name, age, sex, major, career);
	}


	@Override
	public int shanchu(int id) {
		// TODO 自动生成的方法存根
		return dao.shanchu(id);
	}


	@Override
	public int insertjobseeker(job_seeker jb) {
		// TODO 自动生成的方法存根
		return dao.insertjobseeker(jb);
	}

}
