package com.rays.comparator;

import java.util.Iterator;
import java.util.Vector;

public class FailFast {
	public static void main(String[] args) {
		
		Vector l = new Vector();
		
		l.add(100);
		l.add(200);
		l.add("patidar");
		
		Iterator it = l.iterator();
		
		l.add("deepak");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
