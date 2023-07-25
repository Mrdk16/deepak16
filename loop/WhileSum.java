package com.rays.loop;

public class WhileSum {
	public static void  main(String[]args) {
		
		int i = 0;
	
		int sum = 0;
	
		while(i<= 11) {
			System.out.print(i + ",");
			i++;
			sum = sum + i;
			
		}
		 System.out.println("sum of all number is " + sum);
		
	}

}
