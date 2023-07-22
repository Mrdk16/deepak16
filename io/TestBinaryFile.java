package com.rays.io;

import java.io.FileInputStream;

import java.io.FileOutputStream;


public class TestBinaryFile {
	public static void main(String[] args) throws Exception {
		
		String source = "C:\\Users\\Shivam PC\\Desktop\\io\\dk.txt";
		String target = "C:\\Users\\Shivam PC\\Desktop\\io\\chhoti.jpg";
		
		FileInputStream in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		
		int ch = in.read();
		
		while (ch != -1) {
			
			out.write(ch);
			ch = in.read();
			
		}
		out.close();
		in.close();
		
	}

}
