package com.rays.exception;

public class TestAccount {
  
	public static void main(String[] args) {
		
		Account a = new Account();
		a.deposite(5000);
	
	try {
		a.withdraw(4000);
	} catch (LowBalance e) {
		System.out.println(e);
	}
	
	
	
	
	
	
	
	
	
	}
}
