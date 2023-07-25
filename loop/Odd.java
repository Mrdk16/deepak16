package com.rays.loop;

public class Odd {
	public static void main(String[]args) {
		int sum = 0;
		for(int i = 0; i <=20; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				sum = sum +i;
			}
			
	}
		System.out.print(sum);
	}

}
