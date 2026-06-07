package Pattern;

import java.util.Scanner;

public class Patternsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* *****		1row 5star
		 * *****		2row 5star
		 * *****
		 * *****
		 * *****
		 */
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
