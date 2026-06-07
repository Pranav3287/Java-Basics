package Pattern;

public class PatternButterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* *	  *
		 * **	 **
		 * ***	***
		 * ********
		 * ********
		 * ***  ***
		 * **    **
		 * *      *
		 */
		int n=5;
		
		//higher half
		for(int i=1;i<=n;i++) {
			//1st part 
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
				 int spaces=2 * (n-i);
			 //spaces
			 for(int j=1;j<=spaces;j++) {
				 System.out.print(" ");
			 }
			 
			 //2nd part
			 
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//lower half
		for(int i=n;i>=1;i--) {
			//1st part 
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
				 int spaces=2 * (n-i);
			 //spaces
			 for(int j=1;j<=spaces;j++) {
				 System.out.print(" ");
			 }
			 
			 //2nd part
			 
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
