package fundamentals.DATA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


// to explicity specify the encoding, use
// OutputStreamWriter and FileOutputStream
public class FileOutputSreamEncoding {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "/Users/hamiltonhudson/tmp/OutputStreamEncoding_file.txt";

		
		FileOutputStream fos = new FileOutputStream(fileName);
		
		try (OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {
			String text = "Сегодня был прекрасный день.";
			
			osw.write(text);
		}
	}

}
