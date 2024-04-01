package com.failsafe;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMap {

	public static void main(String[] args) {
		ConcurrentHashMap<Student,String> ch=new ConcurrentHashMap();
		ch.put(new Student(1,"bhuvana",23,6789.90,"java"), "hyderabad");
		ch.put(new Student(34,"harshini",22,67345.90,"CA"), "Panjagutta");
		ch.put(new Student(14,"bhanu",22,34589.90,"B.com"), "sycindrabad");
		ch.put(new Student(21,"chinna",21,9890.90,"java"), "hyderabad");
		
		Iterator<Map.Entry<Student,String>> h=ch.entrySet().iterator();
		while(h.hasNext()) {
			Map.Entry<Student,String> s=h.next();
			System.out.println(s.getKey()+"---"+s.getValue());
			ch.put(new Student(2,"madhu",45,8970.90,"agriculture"), "kadiri");
			h.remove();
			h.remove();
			
			
		}
		
		System.out.println(ch);

	}

}
