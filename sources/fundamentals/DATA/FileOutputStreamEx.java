package fundamentals.DATA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// using FileOutputStream to write test to a file
public class FileOutputStreamEx {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "/Users/hamiltonhudson/tmp/OutputStream_file.txt";
		
		try (FileOutputStream fos = new FileOutputStream(fileName)) {
			
			String text = "Today is a beautiful day";
			byte[] mybytes = text.getBytes();
			
			fos.write(mybytes);
		}
	}

}