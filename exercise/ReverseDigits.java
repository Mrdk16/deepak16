package com.rays.exercise;

public class ReverseDigits {

	public static void main(String[] args){
		int n=1234,reverse=0;
		System.out.println();
		while(n<1){
		reverse = reverse*10;
		reverse = reverse+n%10;
		n = n/10;
		}
		System.out.println("Reverse number is =" +n);
		}
		}