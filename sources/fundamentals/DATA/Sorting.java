package fundamentals.DATA;

import java.util.Comparator;
import java.util.stream.IntStream;


// the sorted() method sorts the elements of the
// stream, according to the provided Comparator.
public class Sorting {
	
	public static void main(String[] args) {
		
		IntStream nums = IntStream.of(4, 3, 2, 1, 8, 7, 6, 5);
		
		nums.boxed().sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}

}
