package com.test.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList k=new ArrayList();
		k.add(new Student(1,"bhuvana",23,"b.tech"));
		k.add(new Student(91,"rukmini",22,"m.tech"));
		k.add(new Student(18,"jagathi",20,"msc"));
		k.add(new Student(31,"vimala",19,"bcom"));
		k.add(new Student(4,"sravani",33,"b.tech"));
		Collections.sort(k,new BasedOnNameStudent());
		
		
		Iterator<Student> s= k.iterator();
		while(s.hasNext()) {
			Student d=s.next();
			System.out.println(d);
		}
		

	}

}
