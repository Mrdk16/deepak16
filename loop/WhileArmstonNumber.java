package com.rays.loop;

public class WhileArmstonNumber {

	public static void main(String[]args) {
		
	int number = 121;
	
	int r ;
	
	int sum = 0;
	
	int n = number;
	
	while(n > 0) {
		 
		r = n % 10;
		
		sum = sum + (r * r * r);
		
		n = n / 10;
		n++;
	}
	
	
	if(n == number) {
		System.out.print("armstrong number");
		
	}else {
		System.out.print("not armstrong number");
	
	}
	
}
}