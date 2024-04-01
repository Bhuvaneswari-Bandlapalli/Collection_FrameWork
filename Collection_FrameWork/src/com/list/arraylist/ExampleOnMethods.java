package com.list.arraylist;

import java.util.ArrayList;

public class ExampleOnMethods {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("bhanu");
		al.add("rukku");
		al.add(null);
		al.add("bhanu");
		
		ArrayList al2= new ArrayList();
		
		al2.add(789.90);
		al2.add(23);
		al2.add(2);
		al2.add(789.90);
//		al.add(al2);
//		System.out.println(al);
		al2.addAll(3,al);
		System.out.println(al2);
		
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al);
		al.remove("rukku");
		System.out.println(al);
		al.set(0,"bhuvana");
		System.out.println(al);
		
		System.out.println(al2.get(0));
		System.out.println(al2.containsAll(al2));
		System.out.println(al.contains("bhanu"));
		
		System.out.println(al2.indexOf(23));

		System.out.println(al2.lastIndexOf(2));
	}

}
