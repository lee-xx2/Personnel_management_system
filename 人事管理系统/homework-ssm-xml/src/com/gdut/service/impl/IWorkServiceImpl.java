package com.gdut.service.impl;

import java.util.List;

import com.gdut.beans.Existing_worksheet;
import com.gdut.dao.IWorkDao;
import com.gdut.service.IWorkService;

public class IWorkServiceImpl implements IWorkService {
	private IWorkDao dao;
	

	public void setDao(IWorkDao dao) {
		this.dao = dao;
	}

	@Override
	public int getTotalCount(String a) {
		return dao.getTotalCount(a);
	}

	@Override
	public List<Existing_worksheet> queryByPage(String a, int currentPage, int pageSize) {
		return dao.queryByPage(a,currentPage, pageSize);
	}

}
