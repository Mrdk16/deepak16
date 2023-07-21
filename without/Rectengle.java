package com.rays.without;

public class Rectengle extends Shape {
	private int lengh = 0;
	private int width = 0;

	public void setLengh(int lengh) {
		this.lengh = lengh;
	}
	public int getLengh() {
		return lengh;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}

	public void area() {
	int rarea = getLengh()*getWidth();
	System.out.println("rectengle Area=" +rarea);
 }
	
	
	
}
