package FileInputoutput;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
public class BufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "Student.txt";
		try(BufferedWriter writer =new BufferedWriter(new FileWriter(filename))) {
			writer.write("Ramu Patil");
			
		}catch(IOException e) {
			System.out.println("Error is occured");
		}
		
		System.out.println("Reading the file");
		
		try(BufferedReader Reader= new BufferedReader(new FileReader(filename))){
			String currentLine;
            
            // readLine() reads one line at a time. It returns 'null' when it reaches the end.
            while ((currentLine = Reader.readLine()) != null) {
                System.out.println(currentLine);
            }
            
        	} catch (IOException e) {
        		System.out.println("An error occurred while reading: " + e.getMessage());
        }
	}
}
