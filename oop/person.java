package com.rays.oop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class person {

	@SuppressWarnings("null")
	public static void main(String[] args) throws ParseException {
		 
		@SuppressWarnings("unused")
		SimpleDateFormat str = new SimpleDateFormat("dd/MM/yyyy");		
	String str1 = "16/05/2003";	
	person p = new person();
	
	 p.setName("sonu");
	 p.setName("address");
	 p.setAddr("ashta");
	 DateFormat sdf = null;
	p.setDob(sdf.parse(str1));
	
	System.out.println(p.getName);
	System.out.println(sdf.format(p.getDob()));
	System.out.println(p.getAddr());
	
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setAddr(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDob(Date parse) {
		// TODO Auto-generated method stub
		
	}

	private char[] getAddr() {
		// TODO Auto-generated method stub
		return null;
	}

	Date getDob() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getName;
}
