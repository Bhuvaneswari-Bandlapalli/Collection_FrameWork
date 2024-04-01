package com.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Methods {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap();
		tm.put("One",1);
		tm.put("Two",2);
		tm.put("Four",4);
		tm.put("Six",6);
		tm.put("Eight",8);
		tm.put("Three",3);
		tm.put("Ten",10);
		System.out.println(tm);
		
		tm.putIfAbsent("Nine",9);
		
		TreeMap<String,Integer> tm1=new TreeMap();
		tm1.put("Degree",3);
		tm1.put("Btech",4);
		tm1.put("CA",6);
		System.out.println(tm1);
		System.out.println("----------------");
		
		tm.putAll(tm1);
		//Access TreeMap Elements
		System.out.println("Key/Value Mapping: "+tm.entrySet());
		System.out.println("Keys: "+tm.keySet());
		System.out.println("VAlues: "+tm.values());
		
		//get(),getOrDefault()
		int value1=tm.get("CA");
		System.out.println("using get: "+value1);//6
		int value2=tm.getOrDefault("Bform",2);//2
		System.out.println(value2);
		
		//remove TreeMAp Elements
		System.out.println(tm.remove("Three",3));
		System.out.println("removed Value: "+tm.remove("Ten"));
		
		//replace treemap elements
		tm.replace("Eight",80);//value will replace
		tm.replace("Nine", 9,90);
		System.out.println("updated TreeMap: "+tm);
		//
		
		Set<Map.Entry<String,Integer>> iterate=tm.entrySet();
		for(Map.Entry<String,Integer> j:iterate) {
			System.out.println(j.getKey()+"---"+j.getValue());
		}
		System.out.println("---------------");
		

	}

}
