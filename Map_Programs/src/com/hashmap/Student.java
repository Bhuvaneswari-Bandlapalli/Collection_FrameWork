package com.hashmap;

import java.util.Objects;

public class Student {
	private int sid;
	private String sname;
	private double sfee;
	private String cname;
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
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student(int sid, String sname, double sfee, String cname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.cname = cname;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(cname, sfee, sid, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(cname, other.cname)
				&& Double.doubleToLongBits(sfee) == Double.doubleToLongBits(other.sfee) && sid == other.sid
				&& Objects.equals(sname, other.sname);
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", cname=" + cname;
	}
	
	
}
