package FileInputoutput;
import java.io.*;
public class FileInputStremDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileInputStream Stream = new FileInputStream("Student.txt")) {
			int i;
		    while ((i = Stream.read()) != -1) {
		          // Convert the byte to a character and print it to the console
		          System.out.print((char) i);
		    }
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
