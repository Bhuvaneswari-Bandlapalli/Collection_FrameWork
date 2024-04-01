package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorOne {

	public static void main(String[] args) {
		HashMap<Product,String> y=new HashMap();
		y.put(new Product(1,"nuts",8907.90),"nestle");
		y.put(new Product(2,"pen",80.90),"parker");
		y.put(new Product(3,"pencile",790.90),"apsara");
		
	     Iterator<Map.Entry<Product,String>> j=  y.entrySet().iterator();
//    for(Map.Entry<Product,String> k:j) {
//	    	 Map.Entry<Product,String> m=j.
//	    	 
//	    	 
//	     }
		
		

	}

}
