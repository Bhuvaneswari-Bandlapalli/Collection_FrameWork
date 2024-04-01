package com.hashsetclass;

import java.util.HashSet;
import java.util.Iterator;

public class Two {

	public static void main(String[] args) {
		
		Employeee e1 =new Employeee(1,"Bhuvana",222.5,24);
		Employeee e2 =new Employeee(2,"sony",222.5,24);
		Employeee e3 =new Employeee(3,"chandana",222.5,24);
		Employeee e4 =new Employeee(4,"kavya",222.5,24);
		Employeee e5 =new Employeee(1,"Bhuvana",222.5,24);
		
		HashSet<Employeee> m = new HashSet<>();
		m.add(e1);
		m.add(e2);
		m.add(e3);
		m.add(e4);
		m.add(e5);
		
		Iterator<Employeee> h = m.iterator();
		
		while(h.hasNext())
		{
			Employeee p =h.next();
			System.out.println(p);
		}

	}

}
