package core.java.arrayTest;

public class Array2D {

	public static void main(String[] args) {
		
	    int [][] table3 = new int [10]	[10];
	     
	     for (int i = 1; i < 11; i++) {
			
	    	 for (int j = 1; j < 11; j++) {
	    		 
	    		 table3[i-1][j-1] = i * j;
	    		 
				int m = i *j;
				
				System.out.print(m + "\t");	 
			}
	    	 
	    	 System.out.println(" \t ");
		}
	     System.out.println("no = " + table3[9][9]);
	     
	    
	}
	
}
