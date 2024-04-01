package com.test.arraylist;

public class Person {
   private int pid;
   private String pname;
   private int page;
   private double pfee;
   
   
   
  


 public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public double getPfee() {
	return pfee;
}
public void setPfee(double pfee) {
	this.pfee = pfee;
}
@Override
public String toString() {
	return "pid=" + pid + ", pname=" + pname + ", page=" + page + ", pfee=" + pfee;
}
public Person(int pid, String pname, int page, double pfee) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.page = page;
	this.pfee = pfee;
}
public Person(){
	 
 }
   

}
