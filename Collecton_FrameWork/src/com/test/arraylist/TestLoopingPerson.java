package com.test.arraylist;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestLoopingPerson {

	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList();
		p.add(new Person(1,"bhuvi",67,27755.990));
		p.add(new Person(2,"rukku",23,34755.990));
		p.add(new Person(3,"chinna",21,89755.990));
		p.add(new Person(4,"manju",34,79755.990));
		p.add(new Person(5,"madhu",45,87655.990));
		//List Iterater for list implemented classes only
		
	ListIterator<Person> i=	p.listIterator();
	while(i.hasNext()) {
		Person w=i.next();
		if(w.getPname().equals("rukku")) {
			//i.add(new Person(6,"bilvika",45,37755.990));
			i.set(new Person(7,"ns",60,78755.990));
			System.out.println(w);
		}
		
	}
		System.out.println(p);
		
		
	//Iterator for all collection implemented classes	
		//for each loop
//		for(Person n:p) {
//			System.out.println(n);
//		}
		//for loop
//		for(int i=0;i<=p.size()-1;i++) {
//			System.out.println(p.get(i));
//		}
		
		//iterator
//		Iterator<Person> j= p.iterator();
//		while(j.hasNext()) {
//			Person l=j.next();
//			if(l.getPname().equals("bhuvi")) {
//				j.remove();
//			}
//			
//		}
//		System.out.println(p);
		
		//Enumeration for legacy classes only
		
//		Vector<Person> p=new Vector();
//		p.add(new Person(1,"bhuvi",67,27755.990));
//		p.add(new Person(2,"rukku",23,34755.990));
//		p.add(new Person(3,"chinna",21,89755.990));
//		p.add(new Person(4,"manju",34,79755.990));
//		p.add(new Person(5,"madhu",45,87655.990));
//		
//	Enumeration<Person> k=	p.elements();
//	while(k.hasMoreElements()) {
//		Person g=k.nextElement();
//		System.out.println(g);
//	}
	}

}
