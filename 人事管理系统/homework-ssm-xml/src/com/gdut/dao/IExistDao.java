package com.gdut.dao;

import com.gdut.beans.Existing_worksheet;
import com.gdut.beans.job_seeker;

public interface IExistDao {
	int xiugai(String id,String department,String worktype,String work);

	int shanchu(String no);

	Existing_worksheet queryMessage(int wno);
	
	int insertew(Existing_worksheet ew);
}
