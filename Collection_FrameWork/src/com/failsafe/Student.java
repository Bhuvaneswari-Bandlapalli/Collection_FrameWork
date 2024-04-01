package com.failsafe;

public class Student {
	private int sid;
	private String sname;
	private int sage;
	private double sfee;
	private String scourse;
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sfee=" + sfee + ", scourse=" + scourse;
	}
	public Student(int sid, String sname, int sage, double sfee, String scourse) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sfee = sfee;
		this.scourse = scourse;
	}
	
	
	

}
