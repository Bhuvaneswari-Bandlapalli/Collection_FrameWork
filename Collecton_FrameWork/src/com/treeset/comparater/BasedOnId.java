package com.treeset.comparater;

import java.util.Comparator;

public class BasedOnId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Integer i=o1.getSid();
		Integer i1=o2.getSid();
		//return o1.getSname().compareTo(o2.getSname());
		return i.compareTo(i1);
	}
	

}
