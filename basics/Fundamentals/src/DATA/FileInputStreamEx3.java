package hh_ex.DATA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


// read a file by data chunks (i.e. 1024 bytes
// in each method call) -- more efficient
public class FileInputStreamEx3 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "/Users/hamiltonhudson/tmp/InputStream_file3.txt";
		
		try (FileInputStream fis = new FileInputStream(fileName)) {
			int i = 0;
			
			do {
				byte[] buf = new byte[1024];
				i = fis.read(buf);
				
				String value = new String(buf, StandardCharsets.UTF_8);
				System.out.print(value);
				
			} while (i != -1);
		}
	}

}
