package hh_ex.DATA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

// Streams are created from various sources 
// such as collections, arrays, strings,
// IO resources, or generators.
public class CreatingStreams {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("sun", "moon", "stars", "planets");
		
		String word = words.parallelStream().findFirst().get();
		System.out.println(word);
		System.out.println(words);
		
		Stream<String> letters = Arrays.stream(
				new String[] {"a", "s", "t", "r", "o"});
		System.out.printf("There are %d letters %n", letters.count());
		
		String ascendant = "Sagittarius";
		IntStream instr = ascendant.codePoints();
		
        String s = instr.filter(e -> e != 'n').collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append).toString();
		System.out.println(s);				
	}

}
