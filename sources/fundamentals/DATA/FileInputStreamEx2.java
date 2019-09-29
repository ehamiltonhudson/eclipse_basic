package fundamentals.DATA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// read a whole file character by character
// read() method returns -1 if end of the
// file is reached. However, is ultimately
// not a very efficient way
public class FileInputStreamEx2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "/Users/hamiltonhudson/tmp/InputStream_file2.txt";
		
		try (FileInputStream fis = new FileInputStream(fileName)) {
			int i;
			
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		}
		
		System.out.println();
		
	}

}
