package com.treeset.comparater;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet k=new TreeSet(new BasedOnId());
		k.add(new Student(1,"bhuvana",23,"b.tech"));
		k.add(new Student(91,"rukmini",22,"m.tech"));
		k.add(new Student(18,"jagathi",20,"msc"));
		k.add(new Student(31,"vimala",19,"bcom"));
		k.add(new Student(4,"sravani",33,"b.tech"));
		
		Iterator<Student> s= k.iterator();
		while(s.hasNext()) {
			Student d=s.next();
			System.out.println(d);
		}
		

	}

}
