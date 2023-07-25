package com.rays.test;

public class TestLargest {

	public static void main(String[] args) {
		
		
		int [] arr = {20 , 40, 68, 69, 89 ,800};
		
		int largest = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]> largest) {
				largest = arr[i];
				
			}
		}
		System.out.println(largest);
	}
	
	
}
