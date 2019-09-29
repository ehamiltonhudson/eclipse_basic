package fundamentals.DATA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// append data to a file. (typical 
// usage for appending is logging)
public class FileOutputStreamAppend {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "/Users/hamiltonhudson/tmp/OutputStreamAppend_file.txt";
		
		try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
			
			String text = "Today is a great day";
			byte[] mybytes = text.getBytes();
			
			fos.write(mybytes);
		}
	}
}
