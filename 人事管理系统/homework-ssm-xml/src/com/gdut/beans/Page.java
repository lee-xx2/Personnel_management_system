package com.gdut.beans;

import java.util.List;


	public class Page {
		//��ǰҳcurrentPage
		private int currentPage;		
		//ҳ���СpageSize
		private int pageSize;
		//��ǰҳ�����ݼ���
	   private	List<Existing_worksheet> ews;
	   //������totalCount
	   private	List<job_seeker> jbs;
	   private List<wages> wgs;
	   
	   
	   private int totalCount;
	   //��ҳ��(������ ��ҳ���С)   �����ǵ�������������set()��ҳ���Сset()�Ժ�,�Զ��������ҳ��
	   private int totalPage;
	   //�޲ι���
	   public Page() {}
	  //�вι��췽��
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
		//�Զ�������ҳ�� ��ҳ��=��������%ҳ���С==0����������%ҳ���С����������/ҳ���С+1
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
