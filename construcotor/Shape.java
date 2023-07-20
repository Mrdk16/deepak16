package com.rays.construcotor;


public class Shape {
 private String Color = null; 
 private int borderWigth = 0;

 public Shape() {
	 System.out.println("default costructor");
} 
 public Shape( int borderWigth, String Color) {
		
 this();
 this.Color = Color;
 this.borderWigth = borderWigth;
 
 } 
 public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public int getBorderWigth() {
	return borderWigth;
}
public void setBorderWigth(int borderWigth) {
	this.borderWigth = borderWigth;
}

 
}







