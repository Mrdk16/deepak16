package com.rays.oop;

public class Account {

	private int id =0; 
	private String name = null;
	
	public void setId(int id) {
    this.id = id;
}  
	public int getId() {
    return id;
	}
    public void setName(String name) {
	this.name = name;
    }
    	public String getName() {
    	return name;
    	
        	}
   private int balance = 0;
   public void setBalance(int balance) {
   this.balance = balance;
   }
    public int getBalance() {
   return balance;
    }
   public void deposite(int amount) {
   int total = getBalance()+amount;    
   setBalance(total); 

   
   System.out.println("balance after deposite "+ getBalance());
   }    
   public void withdrawl(int amount) {
	   int total = getBalance() - amount;
	   setBalance(total);
	  
	System.out.println("balance after withdrawl" + getBalance());
  
 
   }
}   

