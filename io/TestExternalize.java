package com.rays.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestExternalize  {
	
	
	public static void main(String[] args) throws Exception {
		 
		FileOutputStream file = new FileOutputStream("C:\\Users\\Shivam PC\\Desktop\\io\\Employee.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.id = 1;
		e.name = "deepak";
		e.address = "ashta";
		e.salary = 9000;
		
		out.writeObject(e);
		
		out.close();
		out.close();
		
		
	}

}



