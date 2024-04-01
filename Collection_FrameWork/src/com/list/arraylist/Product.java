package com.list.arraylist;

public class Product {
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
	
	public Product() {
		
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

	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pbugs=" + pbugs;
	}
	

}
