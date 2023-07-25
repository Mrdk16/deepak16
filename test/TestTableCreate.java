package com.rays.test;

public class TestTableCreate {
	
	public static void main(String[] args) {
		
		int [][] table = new int [10][11];
		
		for(int i = 1; i <=11; i++){
		
			for(int j = 2; j<=11; j++) {
				
				table[i-1 ][j-1] = i * j;
				
				int m = i * j;
				
				
				 System.out.print(m + "\t");
			
			}
			System.out.println();
		}
		 
	}

}
