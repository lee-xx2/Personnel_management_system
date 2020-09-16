package com.gdut.beans;

public class wages {
	private String department ;
	private int id;
	private String name;
	private String biaozhun;
	private String ticheng;
	private String yingfa;
	private String koushui;
	private String shifa;
	
	public wages() {
		
	}
	
	
	
	
	public wages(String department,int id, String name, String biaozhun, String ticheng, String yingfa,
			String koushui, String shifa) {
		super();
		this.department = department;
		this.id = id;
		this.name = name;
		this.biaozhun = biaozhun;
		this.ticheng = ticheng;
		this.yingfa = yingfa;
		this.koushui = koushui;
		this.shifa = shifa;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBiaozhun() {
		return biaozhun;
	}
	public void setBiaozhun(String biaozhun) {
		this.biaozhun = biaozhun;
	}
	public String getTicheng() {
		return ticheng;
	}
	public void setTicheng(String ticheng) {
		this.ticheng = ticheng;
	}
	public String getYingfa() {
		return yingfa;
	}
	public void setYingfa(String yingfa) {
		this.yingfa = yingfa;
	}
	public String getKoushui() {
		return koushui;
	}
	public void setKoushui(String koushui) {
		this.koushui = koushui;
	}
	public String getShifa() {
		return shifa;
	}
	public void setShifa(String shifa) {
		this.shifa = shifa;
	}
	
}
