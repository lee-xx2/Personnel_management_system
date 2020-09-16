package com.gdut.service;

import java.util.List;

import com.gdut.beans.wages;

public interface IWagesService {
	List<wages> queryAll();
	int getTotalCount(String a);
	
	List<wages> queryByPage(String a, int currentPage,int pageSize);
	
	int xiugai(int id,String department,String name,String biaozhun, String ticheng,String yingfa,String koushui,String shifa);

	int shanchu(int id);

	wages queryMessage(int id);
	
	int insertwages(wages wg);
}
