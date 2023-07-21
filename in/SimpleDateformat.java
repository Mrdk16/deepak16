package com.rays.in;

import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateformat {
public static void main(String[] args) {
//convertion from java date to string
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	 Date d = new Date();
	
	System.out.println(sdf.format(d));
}
}