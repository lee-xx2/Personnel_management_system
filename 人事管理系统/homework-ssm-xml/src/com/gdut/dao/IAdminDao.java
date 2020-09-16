package com.gdut.dao;

import com.gdut.beans.Admin;


public interface IAdminDao {
	Admin queryAdmin(Admin admin);

	int updatePassword(String accound, String newPassword);
	
	int deleteadmin(String accound);
}
