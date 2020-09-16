package com.gdut.service;

import com.gdut.beans.Login;

public interface IPersonService {

	Login queryLogin(Login login);

	int queryByAccound(String accound);
	
	int insertLogin(Login login);
	
	int deleteLogin(String accound);
	
	int updatePassword(String accound,String password);
}
