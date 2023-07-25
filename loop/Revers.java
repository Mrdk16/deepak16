package com.rays.loop;

public class Revers {

	public static void main(String[]args) {
		
		int number = 644647;
		
		int r = 0;
		
		 int n = 0;
	
		
		while(number >  0) {
			
			r = number / 10;            // r = 12   
			
			n = number % 10;            //n = 3      
			
			 number  = r ;             // number = 12
			
			System.out.print(n);
			
			r++;
		}
	}
}
