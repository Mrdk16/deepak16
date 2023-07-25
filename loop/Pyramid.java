package com.rays.loop;

public class Pyramid {
	public static void main(String[]args) {
        int i , j , k;
		int a = 5;
		for(i = 1; i <= a ; i++) {
			
			for(j = a; j>= i; j--) {
				System.out.print(" ");
			}
			for(k = 1; k <=i; k++) {
				
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
    }
}

