package com.treeset.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		
		
		t.add(new Product(61,"Tv",67658.90,"No remote"));
		t.add(new Product(28,"Ac",76598.90,"No cooling"));
		t.add(new Product(39,"Fridge",56658.90,"No bugs"));
		t.add(new Product(94,"Geezer",78658.90,"No heat"));
		t.add(new Product(54,"Iphone",677658.90,"No charger"));
		
		
		Iterator<Product> i= t.iterator();
		while(i.hasNext()) {
			 Product p=i.next();
			 System.out.println(p);
			
		}
		
		
		
		
		
	}

}
