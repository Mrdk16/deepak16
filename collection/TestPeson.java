package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestPeson {

	public static void main(String[] args) {
		 
	Collection c1 = new ArrayList();
	
	c1.add("deepak");
	c1.add("jatin");
	c1.add("indore");
	
	Collection c2 = new ArrayList();
	
	c2.add(100);
	c2.add(200);

	
	Iterator it = c1.iterator();	
    while (it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
    	
	}
	
	}
}