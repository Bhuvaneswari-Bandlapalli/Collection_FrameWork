package com.treesetclass;

import java.util.Comparator;
import java.util.TreeSet;

public class treesetCompare {

	
	public static void main(String[] args) {
		
		Employeee e=new Employeee(1,"bhuvi",6789.90,89);
		Employeee e1=new Employeee(2,"chinni",6789.90,89);
		Employeee e2=new Employeee(3,"bhuvana",6789.90,89);
		Employeee e3=new Employeee(4,"rukku",6789.90,89);
		
		TreeSet<Employeee> t= new TreeSet();
		
		t.add(e);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employeee y:t) {
			
			//System.out.println(y.getEid()+"--"+y.getEname()+"----"+y.getEsalary()+"---"+y.getEage());
			System.out.println(y);
			
		}
	}

}
