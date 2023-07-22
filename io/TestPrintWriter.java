package com.rays.io;

import java.io.FileWriter;

import java.io.PrintWriter;

public class TestPrintWriter {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter w = new FileWriter("C:\\Users\\Shivam PC\\Desktop\\io\\dk.txt");
		
		PrintWriter out = new PrintWriter(w, true);
		
		out.println("Hare Krishna");
		out.println("Ram Krishna");
		out.println("Har Har Mahadev");
		out.println("Bajrang Bali");
		
		out.close();
        w.close();
	}

}
