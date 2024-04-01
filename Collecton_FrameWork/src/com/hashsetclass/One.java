package com.hashsetclass;

import java.util.HashSet;

public class One {

	public static void main(String[] args) {
		String s=new String("bhuvana");
		String s1=new String("bhuvana");
		System.out.println(s==s1);// referece comparision--gives the false
		System.out.println(s.equals(s1));//content comparision----gives true
		
		Integer i=new Integer(2);
		Integer i1=new Integer(2);
		System.out.println(i==i1);// referece comparision--gives the false
		System.out.println(i.equals(i1));//content comparision----gives true
		
		
		One t=new One();
		One t1=new One();
		System.out.println(t.equals(t1));//object.equals is reference comparision---give false
		System.out.println(t==t1);// referece comparision--gives the false
		
		
		
		HashSet h=new HashSet();
		

	}

}
