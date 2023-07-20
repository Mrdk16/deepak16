package com.rays.comparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

		
	private int id = 0;
	private String name = null;
	private String address = null;

	public Employee (int id ,  String name , String address ) {
		
		this.id = id ;
		this.name = name;
		this.address = address;
	
	}
	
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		 
	return id + "\t " + name + " \t" + address + " \t";
	}
	 
	public int compareTo(Employee o) {
		
	int i = this.id - o.id;
	
	if(i == 0) {
	
	int j = this.name.compareTo(o.name);

	if (j == 0) {
		
	return this.address.compareTo(o.address);
	
	
	}

	return j;
	
	 }
	return this.id - o.id;

   }
}


	
