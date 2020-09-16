package com.gdut.dao;

import java.util.List;

import com.gdut.beans.Existing_worksheet;

public interface IWorkDao {
	int getTotalCount(String a);
	
	List<Existing_worksheet> queryByPage(String a, int currentPage,int pageSize);
}
