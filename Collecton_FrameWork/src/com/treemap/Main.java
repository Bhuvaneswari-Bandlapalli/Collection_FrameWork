package com.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
//		Product p=new Product(1,"nuts",238);
//		Product p1=new Product(2,"fruits",678);
//		Product p2=new Product(3,"rice",588);
//		Product p3=new Product(4,"millates",8978);
		
		
		
		TreeMap<Product,Integer> t=new TreeMap();
		t.put(new Product(1,"fruits",238), 34);
		t.put(new Product(2,"nuts",678), 90);
		t.put(new Product(3,"rice",588), 45);
		t.put(new Product(4,"millates",8978),29);
		
		Set<Map.Entry<Product,Integer>> h= t.entrySet();
		for(Map.Entry<Product,Integer> k:h) {
			System.out.println(k);
		}
		
		
		

	}

}
