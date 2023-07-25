package com.rays.test;

public class TestCountArgs {
	 public static void main(String[] args) {
	    	
	    	int count = 0;
	    	
	    	for(String string : args ) {
	    			
	    	for (int i = 0; i < string.length(); i++) {
	    		
	    		if(string.charAt(i)=='u') {
	    			
	    			count++;
	    		}
	    		
			}
	    	System.out.println(string);
	    	}
	    	
	    	System.out.println("u in args = "+ count);
	    }

}
