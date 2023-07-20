package com.rays.comparator;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(10);
		v.add(20);
		v.add("naman");
		v.add("vikash");
		
		Enumeration e = v.elements();
		
		v.add("idnore");
		v.add("ujjain");
		
		while (e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
	}

}
