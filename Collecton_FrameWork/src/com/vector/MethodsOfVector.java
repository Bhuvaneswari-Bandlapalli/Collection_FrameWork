package com.vector;

import java.util.Vector;

public class MethodsOfVector {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(1234);
		v1.add("manju");
		
		Vector v=new Vector();
		v.add(12);
		v.add("bhuvana");
		v.add("rukku");
		v.add(234.57889);
		//v.addAll(v1);
		v.addElement(v1);
		//System.out.println(v.size());
		//System.out.println(v.capacity());
		//System.out.println(v.elementAt(2));
		//System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		System.out.println(v.removeElement(v1));//collecton object
		System.out.println(v.remove(0));//index
		System.out.println(v);

	}

}
