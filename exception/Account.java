package com.rays.exception;

public class Account {

	private int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
 public void deposite(int amount ) {
		 
		 int total = getBalance() + amount;
		 
		 setBalance(total);
	System.out.println("balance after deposite =" + getBalance());
 } 
	 public void withdraw(int amount) throws LowBalance {
		 
		 int total = getBalance() - amount;
		 
		 if(total < 2000) {
		 throw new LowBalance();
		
		 }else {
			 
		 setBalance(total);
	    System.out.println("balance after withrawl=" + getBalance());
		 }
}

}