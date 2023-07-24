package com.rays.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserializable {

	public static void main(String[] args)  throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shivam PC\\Desktop\\io\\dk.txt");
		
		ObjectInputStream out = new ObjectInputStream(file);
		
		  Marksheet m = (Marksheet) out.readObject();
		  
		  System.out.println(m.id);
		  System.out.println(m.name);
		  System.out.println(m.cham);
		  System.out.println(m.phy);
		  System.out.println(m.math);
		  System.out.println(m.total);
	
       out.close();
       file.close();
	} 
	
	

}
