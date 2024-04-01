package com.test.arraylist;



public class Product implements Comparable<Product>  {
	private int pid;
	private String pname;
	private double pprice;
	private String pbugs;
	public Product(int pid, String pname, double pprice, String pbugs) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pbugs = pbugs;
	}
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pbugs=" + pbugs;
	}
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
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public String getPbugs() {
		return pbugs;
	}
	public void setPbugs(String pbugs) {
		this.pbugs = pbugs;
	}
	
	
	public Product() {
		
	}
	@Override
	public int compareTo(Product o) {
		Integer h=pid;
		return h.compareTo(o.getPid());
		//return pname.compareTo(o.getPname());
	}

}
