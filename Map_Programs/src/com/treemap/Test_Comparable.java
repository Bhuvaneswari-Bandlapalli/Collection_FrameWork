package com.treemap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test_Comparable {

	public static void main(String[] args) {
		TreeMap<Employeee,String> em=new TreeMap();
		em.put(new Employeee(23,"sravani",56789.90,24),"cisco");
		em.put(new Employeee(89,"jagathi",23456.20,30),"Wallnut");
		em.put(new Employeee(12,"Bilvika",56478.90,29),"TCS");
		em.put(new Employeee(1,"Viswa",12378.90,26),"tech mahindra");
		em.put(new Employeee(1,"Viswa",12378.90,26),"tech mahindra");
		
		Iterator<Entry<Employeee,String>> it=em.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Employeee,String> l=it.next();
			System.out.println(l);
		}

	}

}
