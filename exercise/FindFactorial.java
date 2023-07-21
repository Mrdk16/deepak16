package com.rays.exercise;


public class FindFactorial {
public static void main(String[] args) {
	
	int num = 0; 
	int result = 1;
	while(num>0){
		result = result * num;
		num--;
	}
	System.out.println("Factorial of Given no. is : "+result);
}

}