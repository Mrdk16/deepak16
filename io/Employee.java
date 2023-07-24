package com.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	
	public int id = 0;
	public String  name = null;
    public String address = null;
	public int salary = 0;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	out.writeObject(id);
	out.writeObject(name);
	out.writeObject(address);
	out.writeObject(salary);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
		id = (int) in.readObject();
		name = (String) in.readObject();
		address = (String) in.readObject();
		
		
	}
	
	
}
