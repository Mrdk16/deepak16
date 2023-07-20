package com.rays.construcotor;

import com.rays.without.Rectengle;

public class TestShape {
public static void main(String[] args) {
	
	
	Rectengle r = new Rectengle();
	r.setBodarWidth(10);
	r.setColor("red");
	r.setLengh(20);
	r.setWidth(50);
	
	
	System.out.println(r.getBordarWidth());
    System.out.println(r.getColor());
    System.out.println(r.getLengh());
    System.out.println(r.getWidth());
     }
}
