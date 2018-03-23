/*
  	ISYS 320
  	Name(s):Rona Davis	
  	Date: March 21, 2018
  	
    1
   22
  333
 4444
55555

  	
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		for( int i = 1; i<= 5; i++ ) {
			 
			for(int j = 1; j<= (5-i); j++) {
				System.out.print(" ");
			
	
			}
			for( int j = 1; j<=i; j++ ) {
				 System.out.print(i);
			 }
			System.out.println();
		}
	}
}
