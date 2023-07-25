package com.rays.test;

public class ReverseNo {
	
	public static void main(String[] args) {
		int number = 5647;
		int reverse = 0;
			
		while(number != 0) {
			
			int r = number %10;
			
			reverse =  reverse *10 + r;
			
			number = number / 10;
			
		}
		System.out.println("reverse no is = "+ reverse);
	}

}
