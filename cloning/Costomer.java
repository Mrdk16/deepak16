package com.rays.cloning;

public class Costomer implements Cloneable {

  String name = null;
  Account account = null; 

public Costomer(String name) {
	this.name = name;
     this.account = new Account(100);

}
  
@Override
	protected Object clone() throws CloneNotSupportedException {
		Costomer c = (Costomer) super.clone();
		c.account =(Account) account.clone();
		return super.clone();
	}

}
