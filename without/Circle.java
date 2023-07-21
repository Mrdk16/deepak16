package com.rays.without;


public class Circle  extends Shape {
	
	private int radius ;
	
	public static final  double  PI = 3.14;
	
	public Circle(int radius) {
		
		
		this.radius = radius;
	}
	
	public void setradius( int radius) {
		 
		this.radius = radius;
		
	}
	public int getradius() {
		
		return  radius;
	}
	public void area () {
		
		double carea = (PI * radius * radius);
		
		System.out.println("area of circle = "+ carea);
	
	}
	 	

}

	
	
	

