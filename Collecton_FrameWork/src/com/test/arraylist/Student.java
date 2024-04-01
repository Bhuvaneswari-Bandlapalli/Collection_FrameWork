package com.test.arraylist;

public class Student {
	private int sid;
	private String sname;
	private int age;
	private String squal;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSqual() {
		return squal;
	}
	public void setSqual(String squal) {
		this.squal = squal;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", age=" + age + ", squal=" + squal;
	}
	public Student(int sid, String sname, int age, String squal) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.squal = squal;
	}
	
	
	public Student() {
		
	}

}
