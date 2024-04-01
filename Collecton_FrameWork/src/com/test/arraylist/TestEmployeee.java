package com.test.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeee {

	public static void main(String[] args) {
		Employeee emp=new Employeee();
		emp.setEid(1);
		emp.setEname("bhuvana");
		emp.setEage(24);
		emp.setEsalary(34567.90);
		Employeee emp2=new Employeee(2,"rukku",13234.56,20);
		Employeee emp3=new Employeee(3,"chinna",93456.78,22);
		Employeee emp4=new Employeee(4,"manju",98706.89,42);

		
		Employeee emp5=new Employeee();
		emp5.setEid(5);
		emp5.setEname("bilvika");
		emp5.setEage(24);
		emp5.setEsalary(54267.897);
		
		List<Employeee> l=new ArrayList();
		l.add(emp);
		l.add(emp2);
		l.add(emp3);
		l.add(emp4);
		l.add(emp5);
		for(Employeee k:l) {
			System.out.println(k);
		}
		
	}

}
