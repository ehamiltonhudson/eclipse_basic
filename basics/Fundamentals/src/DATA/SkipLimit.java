package hh_ex.DATA;

import java.util.stream.IntStream;

// the skip(n) method skips the first n elements 
// of the stream and the limit(m) method limits 
// the number of elements in the stream to m.
public class SkipLimit {
	
	public static void main(String[] args) {
		
		IntStream s = IntStream.range(0, 15);
		s.skip(3).limit(5).forEach(System.out::println);
	}

}
