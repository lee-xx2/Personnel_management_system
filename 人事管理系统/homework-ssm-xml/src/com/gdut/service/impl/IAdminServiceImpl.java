package com.gdut.service.impl;

import com.gdut.beans.Admin;
import com.gdut.beans.Login;
import com.gdut.dao.IAdminDao;
import com.gdut.dao.IPersonDao;
import com.gdut.service.IAdminService;

public class IAdminServiceImpl implements IAdminService {
	private IAdminDao dao;
	
	public void setDao(IAdminDao dao) {
		this.dao = dao;
	}

	@Override
	public Admin queryAdmin(Admin admin) {
		// TODO 自动生成的方法存根
		return dao.queryAdmin(admin);
	}

	@Override
	public int updatePassword(String accound, String newPassword) {
		// TODO 自动生成的方法存根
		return dao.updatePassword(accound, newPassword);
	}

	@Override
	public int deleteAdmin(String accound) {
		// TODO 自动生成的方法存根
		return dao.deleteadmin(accound);
	}
	
	
	
}
