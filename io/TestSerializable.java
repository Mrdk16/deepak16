package com.rays.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	
	public static void main(String[] args) throws Exception  {
		
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Shivam PC\\Desktop\\io\\kd.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		
		m.id = 1;
		m.name = "deepak";
		m.cham = 50;
		m.phy = 60;
		m.math = 70;
		m.total = (m.cham + m.phy + m.math);
				out.writeObject(m);
		
		out.close();
		file.close();
		
		}

}
