package com.rays.cloning;

public class Account implements Cloneable{

	int balance = 0;
	
	public Account(int balance) {
	
		this.balance = balance;
		
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
}
