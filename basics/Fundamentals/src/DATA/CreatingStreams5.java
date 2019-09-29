package hh_ex.DATA;

import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// It is possible to create a Stream from a file.
public class CreatingStreams5 {
	
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("/Users/hamiltonhudson/tmp/Stream5_file.txt");
		Stream<String> stream = Files.lines(path);
		
		stream.forEach(System.out::println);
		stream.close();
		
	}

}