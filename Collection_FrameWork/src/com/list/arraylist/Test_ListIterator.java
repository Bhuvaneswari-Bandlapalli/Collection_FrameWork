package com.list.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test_ListIterator {
	//ListIterator in methods:
	//public boolean hasNext(); public Object next();public int nextIndex();
	//public boolean hasPrevious(); public Object previous();public int prevousIndex();
	//public void remove(); public void set(Object O); public void add(Object O);

	public static void main(String[] args) {
		ArrayList<Product> p=new ArrayList();
		p.add(new Product(1,"nuts",908.89,"not good"));
		p.add(new Product(10,"milk",78.90,"no bugs"));
		p.add(new Product(6,"rice",897.96,"no bugs"));
		p.add(new Product(4,"chacolates",67.0,"not tasty"));
		p.add(new Product(20,"vegetables",678.89,"not fresh"));
		
		ListIterator<Product> lp=p.listIterator();
		while(lp.hasNext()) {
			//lp.remove();
			Product pr=lp.next();
			int index=lp.nextIndex();
			
			if(pr.getPname().equals("nuts")) {
				lp.set(new Product(8,"millates",4568.89,"no bugs"));
			}
			
			System.out.println("Index: "+index +" product Details: "+pr);
		}
		lp.remove();
     	lp.add(new Product(9,"biscutes",45.89,"no bugs"));
		System.out.println(p);
		
		System.out.println();
		
		while(lp.hasPrevious()) {
			Product product=lp.previous();
			int index=lp.previousIndex();
			
			System.out.println("index: "+index+" product details: "+product);
			
		}

	}

}
