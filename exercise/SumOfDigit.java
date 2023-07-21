package com.rays.exercise;

public class SumOfDigit {
	public static void main(String args[]){
		int result=0;
		for(int i=100;i<=200;i++){
			if(i%100==0)
				result+=i;
		}
		System.out.println("Output of Program is : "+result);
	}
}
