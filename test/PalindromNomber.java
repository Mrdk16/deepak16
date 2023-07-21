package com.rays.test;

public class PalindromNomber {
public static void main(String[] args) {
		
		int number = 100;
		int r ;
		int sum = 0 , a;
		int m;
		
		m = number;
		
		while(number >0) {
			
			r = number % 10;
			
			sum = (sum * 10) + r;
			
			number = number / 10;
			
		}
		
		if(m == sum) {
			
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not Palindrome number  ");
		}
		
	}
}
