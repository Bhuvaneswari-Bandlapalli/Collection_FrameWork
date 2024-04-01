package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyClass {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		map.put("java",1);
		map.put("sql", 2);
		map.put("microservices",3);
		map.put("spring",4);
		map.put("hibernate",5);
		Set<String> keyset=map.keySet();
		Collection<Integer> values=map.values();
		System.out.println("keys: "+keyset);
		System.out.println("values: "+values);
		
		for(String s:keyset) {
			System.out.println(s+" "+map.get(s));
			
		}
	}

}
