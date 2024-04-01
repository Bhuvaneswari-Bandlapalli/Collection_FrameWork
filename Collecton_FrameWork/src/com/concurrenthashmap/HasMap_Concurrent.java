package com.concurrenthashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HasMap_Concurrent {

	public static void main(String[] args) {
		ConcurrentHashMap<Employeee,String> k=new ConcurrentHashMap();
		k.put(new Employeee(1,"bhuvana",456578.890, 23), "cisco");
		k.put(new Employeee(2,"sony",4567.90, 25), "cisco");
		k.put(new Employeee(3,"koti",987.890, 24), "nokia");
		k.put(new Employeee(4,"chandana",2345.900, 26), "cisco");
		//it is not syncronized but segment level lock will acquire so performance will increase		
		Iterator<Map.Entry<Employeee,String>> j=  k.entrySet().iterator();
		while(j.hasNext()) {
			Map.Entry<Employeee,String> l=j.next();
			System.out.println(l.getKey()+"----"+l.getValue());
			k.put(null, null);
			//k.remove()
			//k.replace()
			
		}
//		Set<Map.Entry<Employeee,String>> n=k.entrySet();
//		for(Map.Entry<Employeee,String> o:n) {
//			System.out.println(o.getKey()+"---"+o.getValue());
//		}
//		
	}

}
