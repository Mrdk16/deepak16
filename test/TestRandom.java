package com.rays.test;


public class TestRandom {
	public static void main(String[] args) {
	    
		int [] arr= {10,20,50,47,36,37,68};
		
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>a) {
				
				a = arr[i];
			
				System.out.println(a);
			
			}
			
			
		}
		
		
	}
}
