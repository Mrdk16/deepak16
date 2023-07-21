package com.rays.oop;

public class sumoops {

	public static void main(String[] args) {
		
	sum(23,50);
	sum(23,55);
	AddLastName("deepak");
	}
	
	public static int sum(int a, int b) {

		int c = a + b;
      System.out.println(c);
		return c;
	}

	public static int max(int a, int b) {

		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
       	
		}
		return 0;
	}
	
		public static String AddLastName(String fname) {

		String str = new String();
			 str = fname + " patidar";

			 System.out.println(str);
		return str;
		
	    }
		
		@SuppressWarnings("unused")
		public static int Table(int a) {
			
			for(int i = 1; i <=10 ; i++) {
			for(int j = 1; j <=10 ; j++) {
		   int  d = i * j;	
			System.out.println(d + "\t");
		}
		
		
		
			return 0;
		}
			return 0;
		
		}
		

		}
	