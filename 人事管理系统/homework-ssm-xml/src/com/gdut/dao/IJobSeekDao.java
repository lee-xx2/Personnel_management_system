package com.gdut.dao;

import java.util.List;

import com.gdut.beans.Existing_worksheet;
import com.gdut.beans.Login;
import com.gdut.beans.job_seeker;

public interface IJobSeekDao {
	List<job_seeker> queryAll();
	int getTotalCount(String a);
	
	List<job_seeker> queryByPage(String a, int currentPage,int pageSize);
	
	int xiugai(int id,String name,int age,String sex,String major,String career);

	int shanchu(int id);

	job_seeker queryMessage(int id);
	
	int insertjobseeker(job_seeker jb);
}
