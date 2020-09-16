package com.gdut.beans;

import java.util.List;


	public class Page {
		//当前页currentPage
		private int currentPage;		
		//页面大小pageSize
		private int pageSize;
		//当前页的数据集合
	   private	List<Existing_worksheet> ews;
	   //总数据totalCount
	   private	List<job_seeker> jbs;
	   private List<wages> wgs;
	   
	   
	   private int totalCount;
	   //总页数(总数据 与页面大小)   当我们调用了数据总数set()与页面大小set()以后,自动计算出总页数
	   private int totalPage;
	   //无参构造
	   public Page() {}
	  //有参构造方法
	public Page(int currentPage, int pageSize, List<Existing_worksheet> ews, int totalPage, int totalCount) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.ews = ews;
		this.totalPage = totalPage;
		this.totalCount = totalCount;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		//自动计算总页数 总页数=数据总数%页面大小==0？数据总数%页面大小：数据总数/页面大小+1
		this.totalPage = this.totalCount%this.pageSize==0?this.totalCount/this.pageSize:this.totalCount/this.pageSize+1;
	}
	public List<Existing_worksheet> getEws() {
		return ews;
	}
	public void setEws(List<Existing_worksheet> ews) {
		this.ews = ews;
	}
	
	
	
	public List<job_seeker> getJbs() {
		return jbs;
	}
	public void setJbs(List<job_seeker> jbs) {
		this.jbs = jbs;
	}
	public int getTotalPage() {
		return totalPage;
	}
	/*public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	*/
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	@Override
	public String toString() {
		return "Page [currentPage=" + currentPage + ", pageSize=" + pageSize + ", ews=" + ews + ", totalCount="
				+ totalCount + ", totalPage=" + totalPage + "]";
	}
	public List<wages> getWgs() {
		return wgs;
	}
	public void setWgs(List<wages> wgs) {
		this.wgs = wgs;
	}

	
}
