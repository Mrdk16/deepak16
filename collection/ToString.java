package com.rays.collection;

public class ToString {
  
	private int id = 0;
	private String name = null;
	
	public ToString(int i, String string) {
		
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + id + ", " + name + "";	
	}
	
}
