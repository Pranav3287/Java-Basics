package FileInputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritierDemo {

	public static void main(String[] args) {
		try {
			FileWriter f1= new FileWriter("Student.txt");
			
			f1.write("As a Language");
			f1.close();
			System.out.println("Successfuly writien...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
