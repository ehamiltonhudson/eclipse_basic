package hh_ex.DATA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
//import java.nio.charset.StandardCharsets;

// FileReader is a class used for reading character files.
// It reads text from character files using a default
// buffer size. Decoding from bytes to characters uses
// either a specified charset or the platform's default charset.
public class FileReaderEx {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(new File("src/resources/thermopylae.txt")))) {

            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);
        }
    }
}


// EXAMPLE FROM TUTORIAL DOES NOT WORK ^^ REFACTORED SOLUTION ABOVE ^^ (NO ENCODING)
//public class FileReaderEx {
//	
//	public static void main(String[] args) throws IOException {
//		
//		var fileName = "/src/resources/thermopylae.txt";
//		
//		try (BufferedReader br = new BufferedReader(
//				new FileReader(fileName, StandardCharsets.UTF_8))) {
//			
//			var sb = new StringBuilder();
//			
//			String line;
//			while ((line = br.readLine()) !=null) {
//				sb.append(line);
//				sb.append(System.lineSeparator());
//			}
//			
//			System.out.println(sb);
//		}
//	}
//
//}