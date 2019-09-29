package fundamentals.DATA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// use FileInputStream to read
// three characters from a file
public class FileInputStreamEx {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
//		String fileName = "/Users/hamiltonhudson/smallfile.txt";
		String fileName = "/Users/hamiltonhudson/tmp/InputStream_file.txt";		
		try (FileInputStream fis = new FileInputStream(fileName)) {
			char char1 = (char) fis.read();
			char char2 = (char) fis.read();
			char char3 = (char) fis.read();
			
			System.out.println(char1);
			System.out.println(char2);
			System.out.println(char3);
		}
	}

}
