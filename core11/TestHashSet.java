package com.rays.core11;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		
	HashSet s = new HashSet();
	
	s.add(2);
	s.add(4);
	s.add(1);
	s.add(3);
	s.add(8);
	s.add(12);
	s.add(10);
	s.add(6);


	Iterator it = s.iterator();
	
	while (it.hasNext()) {
		
		int i = (int) it.next();
		
		System.out.println(i);
	      }
	
	
	}
}
