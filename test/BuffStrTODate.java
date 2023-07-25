package com.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BuffStrTODate {
	
	 	public static void main(String[] args) throws ParseException {
	 		
			 StringBuffer sb = new StringBuffer("20/06/2023"); 
			 
			 String str = sb.toString();
			 
			 SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
			 
			 Date d  = sdf.parse(str);
			 
			 System.out.println(str); 
			 
		}

}
