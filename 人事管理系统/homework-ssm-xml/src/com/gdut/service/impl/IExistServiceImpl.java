package com.gdut.service.impl;

import com.gdut.beans.Existing_worksheet;
import com.gdut.dao.IExistDao;
import com.gdut.service.IExistService;

public class IExistServiceImpl implements IExistService {
	IExistDao dao;
	
	
	
	public void setDao(IExistDao dao) {
		this.dao = dao;
	}

	@Override
	public int xiugai(String id, String department, String worktype, String work) {
		
		return dao.xiugai(id,department,worktype,work);
	}
	@Override
	public int shanchu(String no) {
		return dao.shanchu(no);
	}
	@Override
	public Existing_worksheet queryMessage(int wno) {
		return dao.queryMessage(wno);
	}



	@Override
	public int insertew(Existing_worksheet ew) {
		// TODO 自动生成的方法存根
		return dao.insertew(ew);
	}

}
