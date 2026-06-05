package FileInputoutput;
import java.io.*;
import java.io.IOException;
public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String text="Pranav Yedage";
		
		try(FileOutputStream file=new FileOutputStream("Student.txt")){
			file.write(text.getBytes());
			System.out.println("Succesfully wrote the file...");
		}catch(Exception e) {
			e.getMessage();		
			}
	}
}
