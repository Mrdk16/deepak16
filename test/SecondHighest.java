package com.rays.test;

public class SecondHighest {

	
	
public static void main(String[] args) {
		
		int[] arr = {34,57,89,46,899,24,57,79,57,98};
		
		int a = 0; 
		int b = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>b) {
				
				a = b;
				b = arr[i];
				
			}
			else if(arr[i]>a && arr[i]<b){
				a = arr[i];
				
			}
		}
		System.out.println("second largest number = " + a);
	}

}

