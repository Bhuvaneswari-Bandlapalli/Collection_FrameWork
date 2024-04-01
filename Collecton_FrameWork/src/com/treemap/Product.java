package com.treemap;

public class Product implements Comparable<Product>{
	private int pid;
	private String pname;
	private int pprice;
	
	
	public Product() {
		
	}
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice;
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
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public Product(int pid, String pname, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	@Override
	public int compareTo(Product o) {
		String h=pname;
		return h.compareTo(o.getPname()) ;
	}

	
}
