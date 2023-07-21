package com.rays.exception;

public class TestTryCatch {

	public static void main(String[] args) {
		try {
			
		int a = 10; 
		System.out.println("a =" + a);
		int b = 2;
		System.out.println("b =" + b);
		int c = a/b;
		System.out.println("division ="+c);
		 

		} catch (ArithmeticException e) {
		 System.out.println(e);
		
		
		}
		catch (Exception e) {
		e.printStackTrace();
		
		}
		
		System.out.println("after exception");
		
	}
	
}
