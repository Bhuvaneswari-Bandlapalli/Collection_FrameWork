package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestOne {

	public static void main(String[] args) {
		Customer c=new Customer(1,"buna","ananthapur");
		Customer c1=new Customer(2,"chandana","kadapa");
		Customer c2=new Customer(3,"sony","hyderabad");
		Customer c3=new Customer(4,"kavya","varagal");
		
		
		Product p=new Product(1,"nuts",345.78);
		Product p1=new Product(2,"millates",8907.89);
		Product p2=new Product(3,"rice",678.90);
		Product p3=new Product(4,"milk",5674.90);
		
		HashMap<Product,Customer> h=new HashMap();
		h.put(p,c);
		h.put(p1,c1);
		h.put(p2,c2);
		h.put(p3,c3);
		
		Set<Map.Entry<Product,Customer>>  j= h.entrySet();
		for(Map.Entry<Product,Customer> k:j) {
			System.out.println(k.getKey()+"---"+k.getValue());
		}
		
		
	}

}
