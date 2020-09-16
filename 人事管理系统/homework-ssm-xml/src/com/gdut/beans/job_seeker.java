package com.gdut.beans;

public class job_seeker {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String major;
	private String career;
	public job_seeker() {}
	public job_seeker(int id, String name, int age, String sex, String major, String career) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.major = major;
		this.career = career;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	@Override
	public String toString() {
		return "job_seeker [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", major=" + major
				+ ", career=" + career + "]";
	}
	
	
}
