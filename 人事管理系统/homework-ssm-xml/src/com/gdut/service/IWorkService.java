package com.gdut.service;


 
import java.util.List;

import com.gdut.beans.Existing_worksheet;


public interface IWorkService {
	int getTotalCount(String a);
	
	List<Existing_worksheet> queryByPage(String a, int currentPage,int pageSize);
}
