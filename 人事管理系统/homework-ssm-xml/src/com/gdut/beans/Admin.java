package com.gdut.beans;

public class Admin {
	private String name;
	private String accound;
	private String password;
	
	public Admin() {
		
	}
	public Admin(String accound, String password) {
	
		this.accound = accound;
		this.password = password;
	}
	public Admin(String name, String accound, String password) {
		super();
		this.name = name;
		this.accound = accound;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccound() {
		return accound;
	}
	public void setAccound(String accound) {
		this.accound = accound;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
