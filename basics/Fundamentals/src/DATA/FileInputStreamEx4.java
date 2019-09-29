package hh_ex.DATA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// BufferedReader reads text from a character-input stream,
// buffering characters so as to provide for the efficient
// reading of those characters. ( = more efficient reading)
public class FileInputStreamEx4 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "/Users/hamiltonhudson/tmp/InputStream_file4.txt";
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(fileName), StandardCharsets.UTF_8));) {
			
			String line;
			
			while ((line = br.readLine()) !=null) {
				System.out.println(line);
			}
		}
		System.out.println();
	}

}


