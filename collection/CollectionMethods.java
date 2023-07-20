package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.rays.in.Array;

public class CollectionMethods {

	public static void main(String[] args) {
		
	Collection c1 = new ArrayList();
		
		c1.add(100);
		c1.add("hye");
		c1.add("hello");
		
	Collection c2 = new ArrayList();
		
		c2.add("bgmi");
		c2.add("fire");
		c2.add("fs14");
	    c2.add("Candy Crush");
	 
	    System.out.println(c1);
	 
	    c1.addAll(c2);
	
	
	
	}
	
}
