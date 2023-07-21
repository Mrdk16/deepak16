package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestReadByScanner {
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\Shivam PC\\Desktop\\io\\dk.txt");
		
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			
			System.out.print(sc.next());
			
			
		}file.close();
		sc.close();
	}

}
