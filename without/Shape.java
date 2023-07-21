package com.rays.without;

public class Shape {
	private String Color = null;
	private int bordarWidth = 0;
	
	public Shape () {
		System.out.println("this is default construcotor");
	
	}

	public String getColor () {
		return Color;
		
	}
	public void setColor (String Color) {
		this.Color=Color;
	
		
	}
	public int getBordarWidth() {
		return bordarWidth;
		
	}
	public void setBodarWidth(int bw) {
		bordarWidth =bw;
		
	}
     public void area() {	
     System.out.println("Shape method");
System.out.println("Shape ararea color");
System.out.println("Shape area borderWidth");
   
    }

}

