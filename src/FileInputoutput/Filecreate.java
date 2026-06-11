package FileInputoutput;
import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors
import java.util.Date;
public class Filecreate {
	  public static void main(String[] args) {
	    try {// Create File object
	      File myObj = new File("Student.txt"); 
	      // Try to create the file
	      Date d1=new Date(myObj.lastModified());
	      
	      System.out.println("File is modified on Date:"+d1);
	      
	      if (myObj.createNewFile()) {       
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println(myObj.exists()+" File is already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace(); // Print error details
	    }
	  }
}


