package com.test.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Employeee {
	private int eid;
	private String ename;
	private double esalary;
	private int eage;
	

	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}


	public int getEage() {
		return eage;
	}


	public void setEage(int eage) {
		this.eage = eage;
	}


	public Employeee(int eid, String ename, double esalary, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.eage = eage;
	}
 

	public Employeee() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eage=" + eage ;
	}


	

}
