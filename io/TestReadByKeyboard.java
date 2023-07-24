package com.rays.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadByKeyboard {
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(isReader);
		
		PrintWriter pw = new PrintWriter("C:\\Users\\Shivam PC\\Desktop\\io\\dk.txt");
		
		String line = reader.readLine();
		
		String emailreg = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
		
		while (line.equals("d")){
			
			if (emailreg.matches(line)) {
				
					emailreg.matches(emailreg);
			}
		
		System.out.println(emailreg.matches(line));
			pw.println(line);
			
			line = reader.readLine();
			
	
			reader.close();
			isReader.close();
			
			
			
		}
		
		
		
	}

}
