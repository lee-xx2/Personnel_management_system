package com.gdut.service;

import com.gdut.beans.Existing_worksheet;

public interface IExistService {
	
	int xiugai(String id,String department,String worktype,String work);
	
	int shanchu(String no);

	Existing_worksheet queryMessage(int wno);
	int insertew(Existing_worksheet ew);
}
