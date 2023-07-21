package com.rays.exercise;

public class PrimeNomber {
	public static void main(String args[]){
		int num = 4;
		int flag= 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0)
			{
				System.out.println(num+" is not a Prime Number");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println(num+" is a Prime Number");
	}

}
