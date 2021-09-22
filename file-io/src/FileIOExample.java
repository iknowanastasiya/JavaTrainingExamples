import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {
		
		/*
		 * WITHOUT TRY W/ RESOURCES
		 */
//		FileInputStream in = null;		// input
//		FileOutputStream out = null;	// output
//		
//		try {
//			in = new FileInputStream("src/input.txt");		// will throw an error if file does not exist
//			out = new FileOutputStream("src/output.txt");	// will create file, if it doesn't exist
//				
//			int inByte;		// input stream will read in data one byte at a time
//			while((inByte = in.read()) != -1) {		// -1 means the end of file (eof)
//				out.write(inByte);
//			}
//		
//		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		/*
		 * WITH TRY W/ RESOURCES
		 */
		
		// try with resources
		// can take anything that implements AutoCloseable and creates a resource
		// that resource will automatically close what was passed in
		try(FileInputStream fileIn = new FileInputStream("src/input.txt");
				FileOutputStream fileOut = new FileOutputStream("src/output.txt")) {
			
			int inByte;
			while((inByte = fileIn.read()) != -1) {		// -1 means the end of file (eof)
				fileOut.write(inByte);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
