package com.rays.cloning;

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Costomer c1 = new Costomer("deepak");
		Costomer c2 = (Costomer) c1.clone();
		
		c2.name = "patidar";
	    c2.account.balance = 200;
	System.out.println(c1.name);
	System.out.println(c1.account.balance);
	System.out.println(c2.name);
	System.out.println(c2.account.balance);
	
	
	
	
	}
}
