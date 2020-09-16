package com.gdut.dao;

import com.gdut.beans.Login;

public interface IPersonDao {
	//查询登陆的人
	Login queryLogin(Login login);

	//查询注册的时候是否存在账号
	int queryByAccound(String accound);

	//注册成功
	int insertLogin(Login login);
	
	//删除用户
	int deleteLogin(String accound);
	
	//修改密码
	int updatePassword(String accound,String password);
}
