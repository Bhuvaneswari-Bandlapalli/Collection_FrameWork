package com.test.arraylist;

import java.util.ArrayList;

public class MethodsOfArrayList {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("rukku");
		l.add("chinna");
		
		ArrayList ar=new ArrayList();
		ar.add(12);
		ar.add("bhuvana");
		ar.add(true);
		ar.add(234.5667);
		//ar.add(l);
		ar.addAll(l);
		ar.add(3, "manju");
		//ar.remove(3);//index based
		//ar.remove(l);//object based
		//ar.removeAll(ar);
		//ar.contains("bhuvna");
		//System.out.println(ar.containsAll(l));
		//System.out.println(ar.contains("bhuvana"));
	    //  System.out.println(ar.size());
		//System.out.println(ar.indexOf("manju"));
		//System.out.println(ar.get(0));
		
	      
		System.out.println(ar);
		

	}

}
