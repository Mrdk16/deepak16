package core.java.arrayTest;

public class AllCountArr {
	
 public static void main(String[] args) {
	
	String []  juber = {"mr", "dk", "abc","xyz"};
	 
	  int count = 0;
	  
	  for(char c ='a'; c <='z'; c++) { 
		  
		  for(String s : mr) {
			  
			  for(int i = 0; i < s.length(); i++) {
				  
				  if(s.charAt(i) == c) {
					  
					  count++;
				  }
			  }
			   
		  }
		  
		  if(count > 0) {
			  System.out.println(c + " = " + count);
			  
			  count=0;
			  
		  }
		  
	  }  
 }

}
