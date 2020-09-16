package com.gdut.service.impl;

import com.gdut.beans.Login;
import com.gdut.dao.IPersonDao;
import com.gdut.service.IPersonService;

public class IPersonServiceImpl implements IPersonService{

	private IPersonDao dao;
	
	public void setDao(IPersonDao dao) {
		this.dao = dao;
	}

	public Login queryLogin(Login login) {
		return dao.queryLogin(login);
	}

	@Override
	public int queryByAccound(String accound) {
		
		return dao.queryByAccound(accound);
	}

	@Override
	public int insertLogin(Login login) {
		
		return dao.insertLogin(login);
	}

	@Override
	public int deleteLogin(String accound) {
		return dao.deleteLogin(accound);
	}

	@Override
	public int updatePassword(String accound, String password) {
		return dao.updatePassword(accound, password);
	}
	
}
