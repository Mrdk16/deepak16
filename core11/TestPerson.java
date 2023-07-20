package com.rays.core11;

public class TestPerson {
	public static void main(String[] args) {
		 
		Person p1 = new Person(1, "Deepak");
		
		Person p2 = new Person(1, "Deepak");
		
		Person p3 = new Person(1, "Deepak");
		
		Person p4 = new Person(1, "Deepak");
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p3.equals(p4));
		
		System.out.println(p1.hashCode());
		
		System.out.println(p2.hashCode());
	}

}
