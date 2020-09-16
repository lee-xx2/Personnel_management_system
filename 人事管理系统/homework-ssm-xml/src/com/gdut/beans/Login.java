package com.gdut.beans;

public class Login {
	private String name;
	private String accound;
	private String password;
	public Login(String name, String accound, String password) {
		this.name = name;
		this.accound = accound;
		this.password = password;
	}
	public Login() {
		super();
	}
	public Login(String accound, String password) {
		super();
		this.accound = accound;
		this.password = password;
	}
	public Login(String accound) {
		super();
		this.accound = accound;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", accound=" + accound + ", password=" + password + "]";
	}
	
	
}
