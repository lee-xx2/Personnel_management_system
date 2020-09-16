package com.gdut.service;

import com.gdut.beans.Admin;


public interface IAdminService {
	Admin queryAdmin(Admin admin);

	int updatePassword(String accound, String newPassword);

	int deleteAdmin(String accound);
}
