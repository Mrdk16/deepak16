package com.rays.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
	
 
	List l = new ArrayList();
	
	l.add(new Employee(1, "deepak", "indore"));
	l.add(new Employee(5, "naman", "bhojpur"));
	l.add(new Employee(4, "sachin", "bhopal"));
	l.add(new Employee(3, "vikash", "sehore"));
	l.add(new Employee(2, "jatin", "ujjain"));
	l.add(new Employee(6, "zuber", "ashta"));
	
	Collections.sort(l);
	
	Iterator it = l.iterator();
	
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	
  }





}
