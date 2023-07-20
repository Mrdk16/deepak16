		package com.rays.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudent {
		  
			public static void main(String[] args) {
				
     				List l = new ArrayList();
				
		l.add(new Student (2,  106,  "Deepak", "indore",   "BBA", "hindi"));
		l.add(new Student (5,  105,  "Sunil",  "jaipur",   "BCA", "English"));
		l.add(new Student (6,  104,  "Sanjay", "bhopal",   "MBA", "Accont"));
		l.add(new Student (4,  103,  "Vishal", "ujjain",   "MSC", "Science"));
		l.add(new Student (1,  102,  "Nilesh", "ashta",    "BSC", "Computer"));
		l.add(new Student (3,  101,  "Ritesh", "indore",   "BCA", "Techical"));
		l.add(new Student (8,  109,  "Kapil",  "satna",    "BBC", "hindi"));
		l.add(new Student (7,  107,  "Rahul",  "raisen",   "LLB", "English"));
		l.add(new Student (11, 110,  "Jatin",  "khargoan", "MBL", "Accont"));
		l.add(new Student (9,  108,  "Vikash", "chapda",   "MSB", "Science"));
		l.add(new Student (12, 112,  "Naman",  "sehore",   "KSC", "Computer"));
		l.add(new Student (10, 111,  "Sachin", "kannod",   "BNA", "Techical"));
				
		for(int i = 0; i < l.size(); i++)
					
		System.out.println(l.get(i));
					
		Collections.sort(l, new SortById());
				
		System.out.println("\nSort by id");
				
		for(int i = 0; i < l.size(); i++)
				
		System.out.println(l.get(i));
				
		Collections.sort(l, new SortByRoll());
			
		System.out.println("\nSort by roll");
			
		for(int i = 0; i < l.size(); i++)
			
		System.out.println(l.get(i));
			
		Collections.sort(l, new SortByName());

		System.out.println("\nSort by name");

		for(int i = 0; i < l.size(); i++)
			
		System.out.println(l.get(i));
			
		Collections.sort(l, new SortByAddress());

		System.out.println("\nSort by address");	

		for(int i = 0; i < l.size(); i++)
			
		System.out.println(l.get(i));
			
		Collections.sort(l, new SortBycourse());

		System.out.println("\nSort by course");


		for(int i = 0; i < l.size(); i++)
			
		System.out.println(l.get(i));
			
		Collections.sort(l, new SortBySubject());

		System.out.println("\nSort by subject");


		Iterator it = l.iterator();
		
		while (it.hasNext()) {
		
		System.out.println(it.next());

		}
			
		System.out.println("hello brother");

		System.out.println("that's call bosssss!!!!!!!!!!!");	
      }		
		       
}	