package Pattern;
import java.util.*;
public class Patternhalfpryamid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* *		1row	1star   
		 * **		2row	2star
		 * ***		3row	3satr
		 * ****		4rwo	4star
		 */
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
