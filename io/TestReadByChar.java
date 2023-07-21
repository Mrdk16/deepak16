package com.rays.io;


import java.io.FileReader;

public class TestReadByChar {
	public static void main(String[] args) throws Exception {
		
		
		FileReader file = new FileReader("C:\\Users\\Shivam PC\\Desktop\\io\\dk.txt");
		
		int ch = file.read();
		
		while (ch != -1) {
			System.out.print((char)ch);
			
			ch = file.read();
		}
		
		file.close();
		
	}

}
