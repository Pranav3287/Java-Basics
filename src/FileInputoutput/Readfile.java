package FileInputoutput;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myobj = new File("Student.txt");
	    // try-with-resources: Scanner will be closed automatically
	    try (Scanner myReader = new Scanner(myobj)) {
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }

	}
