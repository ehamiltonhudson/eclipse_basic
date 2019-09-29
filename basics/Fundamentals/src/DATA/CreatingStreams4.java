package hh_ex.DATA;

import java.util.stream.Stream;
import java.util.Random;

// Other methods to create streams are:
// Stream.iterate() and Stream.generate()
public class CreatingStreams4 {
	
	public static void main(String[] args) {
		Stream<Integer> intStr = Stream.iterate(5, n -> n * 2).limit(10);
		intStr.forEach(System.out::println);
		
		Stream.generate(new Random()::nextDouble)
			.map(e -> (e * 10))
			.limit(5)
			.forEach(System.out::println);
	}

}
