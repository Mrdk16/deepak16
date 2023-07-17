package core.java.arrayTest;

public class ATMArray {

	public static void main(String[] args) {
		 int amt = 2680;
		 int count = 0;
		 
		 int [] note = {500,200,100,50,20,10,5,2,1};
		 
		 for (int i = 0; i < note.length; i++) {
			
			 count = amt/ note[i];
			 	 
			 if(count > 0) { 
				 
				 System.out.println(note[i] + " = " + count);
				 
			 }
			 amt = amt %note[i];
		}
	}
	
}
