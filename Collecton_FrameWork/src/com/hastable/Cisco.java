package com.hastable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Cisco {

	public static void main(String[] args) {
		Hashtable<String,Integer> ht=new Hashtable();
		ht.put("bhuvana", 1);
		//ht.put("harika", null);value not null
		//ht.put("bhuvana", 1);key values not be duplicate
		ht.put("rukku", 2);
		ht.put("bhuvana", 3);
		ht.put("koti", 4);
		Set<Map.Entry<String,Integer>> h= ht.entrySet();
		for(Map.Entry<String,Integer> k:h) {
			System.out.println(k);
		}
		
	}

}
