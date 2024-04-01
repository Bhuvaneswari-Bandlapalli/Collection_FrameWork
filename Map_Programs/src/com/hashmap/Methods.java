package com.hashmap;

import java.util.HashMap;

public class Methods {
	public static void main(String[] args) {
		HashMap<String,Integer> numbers=new HashMap();
		numbers.put("One", 1);
	    numbers.put("Two",2);
	    numbers.put("Three",3);
	    numbers.put("Four",4);
	    System.out.println("Map: "+numbers);
	    System.out.println("Keys: "+numbers.keySet());
	    System.out.println("Values: "+numbers.values());
	    System.out.println("Entries: "+numbers.entrySet());
//	    int key=numbers.remove("two");
//	    System.out.println("key value: "+key);
	    System.out.println("size "+numbers.size());
	    System.out.println(numbers.get("Four"));
	    System.out.println(numbers.containsKey("One"));
	    System.out.println(numbers.containsValue(1));
	    System.out.println(numbers.replace("Four",4,40));
	    System.out.println(numbers.replace("Two",20));
	    System.out.println(numbers);
	    
	    
	   System.out.println(numbers.equals(numbers));
//	    boolean num=numbers.remove("Two",2);
//	    System.out.println(num);
		
	}

}
