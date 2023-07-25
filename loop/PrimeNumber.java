package com.rays.loop;

public class PrimeNumber {
	public static void main(String[]args) {
	
		int number = 100;
		
	    int count = 0;
	    
	    for(int i = 2; i < number; i++){
	    	
	    if(number % 2 == 0) {
	    	
	    	count++;
	    	System.out.println(i);
	    }
	    	
	    }
	       
	    if(count==0) {
        	System.out.print("prime number");
        }else {
        	System.out.print("not prime number");
        }
	   
	    }
 
	}

