package com.rays.loop;

public class Table {
	public static void main(String[]args) {
		int i;
		int sum = 0;
		
		for(i = 3; i <=30; i+=3) {
			System.out.println(i);
			sum = sum +i;
			
		}
		System.out.println("sum of table of 3  = " + sum);
	}

}
