package com.rays.core11;


import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {

		SortedSet st =  new TreeSet();
		
		st.add("s");
		st.add("a");
		st.add("b");
		st.add("d");
		st.add("h");
		st.add("e");
		
		System.out.println(st);
		
		/*
		 * for(Object object: set) {
		 * 
		 * System.out.print(object + ","); }
		 */
		/*
		 * System.out.println();
		 * 
		 * System.out.println(set.first()); System.out.println(set.last());
		 * System.out.println(set.headSet("d")); System.out.println(set.tailSet("e"));
		 * System.out.println(set.subSet("c", "f"));
		 * 
		 */	}

}


