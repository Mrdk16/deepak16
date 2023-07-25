package com.rays.loop;

public class WhileEven {
	public static void main(String[]args) {
		
		int i = 0;
		
		//int r = 0;
		
		int sum = 0;
		 
		 while(i <= 20) {
					
		 if(i%2==0){
			 System.out.println(i);
			 i++;
			 
		 }
		 sum = sum +i;
		 i++;
		 }
		 System.out.print(sum);

		 }
	}


