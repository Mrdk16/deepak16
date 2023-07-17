package core.java.arrayTest;

public class TableArray {
	
	public static void main(String[] args) {
		
		int [] table = {2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 , 20};
		
		int number = 12;
		
		for(int i  = 0; i < table.length; i++) {
			
			if(table[i] == number) {
				
				System.out.println("inedx = "+ i + "  value = "+ table[i]);
			}
	   }
		
	}

}
