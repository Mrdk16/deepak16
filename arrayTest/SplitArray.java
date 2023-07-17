package core.java.arrayTest;

import java.util.jar.Attributes.Name;

public class SplitArray {
	public static void main(String[] args) {
		
		String name = "juber pathan indore";  
		
		 String [] names = name.split(" ");
		
		 
		 for(int i = 0; i < names.length; i++) {
			 
		 for(int j =names[i].length()-1 ;j >=0; j--) {
				 
			 System.out.print(names[i].charAt(j));
				 
			 }
			 System.out.print(" ");
		
		
		 } 
		 
	}

}
