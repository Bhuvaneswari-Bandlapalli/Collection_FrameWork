package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	

	public static void main(String[] args) {
		Employeee h1=new Employeee(11,"bhuvana",3456.78,24);
		Employeee h2= new Employeee(25,"chinna",89087.90,32);
		Employeee h3=new Employeee(33,"rukku",35678.90,25);
		Employeee h4= new Employeee(46,"bilvika",88987.90,54);
		HashMap<Employeee,String> u=new HashMap();
		u.put(h1, "cisco");
		u.put(h2, "TCS");
		u.put(h3, "Infosys");
		u.put(h4, "cisco");
		u.put(new Employeee(78,"subbu",67890.90,54),"tech mahidra");
		
		Set<Map.Entry<Employeee,String>> j=u.entrySet();
		for(Map.Entry<Employeee,String> k:j) {
			System.out.println(k.getKey()+"---"+k.getValue());
			
			
		}
		

	}

}
