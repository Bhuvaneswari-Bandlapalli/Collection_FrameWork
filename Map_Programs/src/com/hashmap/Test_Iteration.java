package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test_Iteration {

	public static void main(String[] args) {
		HashMap<Student,String> hm=new HashMap();
		hm.put(new Student(1,"bhuvana",6783.90,"java"),"B.tech");
		hm.put(new Student(9,"reddy",6745.90,"SQL"),"B.com");
		hm.put(new Student(20,"chinna",2343.56,"Python"),"B.tech");
		hm.put(new Student(50,"sudarshan",4783.90,".net"),"BA");
		hm.put(new Student(12,"sandeep",2678.90,"selineum"),"msc");
		hm.put(new Student(12,"sandeep",2678.90,"selineum"),"msc");
		
		Set<Map.Entry<Student,String>> k=hm.entrySet();
		for(Map.Entry<Student,String> l:k) {
			System.out.println(l.getKey()+"----"+l.getValue());
		}
		
		System.out.println("--------------------------------------------");
		Iterator<Map.Entry<Student,String>> o=hm.entrySet().iterator();
		while(o.hasNext()){
			Map.Entry<Student,String> e=o.next();
			System.out.println(e);
			
		}
			
	}

}
