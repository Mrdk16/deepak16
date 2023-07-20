package com.rays.collection;

public class Person {

	private int id = 0;
	private String name = null;
	public Person(int id , String name) {
		
		this.id = id;
		this.name = name;
		
	}
	public Person(String string) {
		
	}
	public int getid() {
		return id;
		
	}
	public String getname() {
		
		return name;
	}
	@Override
	public String toString () {
		return "(" + id + ", " + name + ")";		
    }
	
}
	

