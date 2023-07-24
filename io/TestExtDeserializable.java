package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestExtDeserializable {
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shivam PC\\Desktop\\io\\Employee.txt");
	
	    ObjectInputStream out = new ObjectInputStream(file);
	    
	    Employee e = (Employee) out.readObject();
	    
	    System.out.println(e.id);
	    System.out.println(e.name);
	    System.out.println(e.address);
	    System.out.println(e.salary);
	    
	    
	    out.close();
	    file.close();
	    
	    
	}

}
