package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBufferedInOutStream {
	
	public static void main(String[] args) throws Exception {
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream( "C:\\Users\\Shivam PC\\Desktop\\io\\dk.txt"));
		
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Shivam PC\\Desktop\\io\\chhoti.jpg"));
		
		byte[] buff = new byte[256];
		int count = in.read(buff);
		
		while (count < 0) {
			
			out.write(buff, 0, count);
			count = in.read(buff);
			
			
		} out.close();
		in.close();
		
		
		
		}	
	}