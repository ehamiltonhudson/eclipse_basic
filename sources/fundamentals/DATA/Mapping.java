package fundamentals.DATA;

import java.util.Arrays;
import java.util.stream.IntStream;


// The map() method returns a stream consisting of the results of
// applying the given function to the elements of a stream. It changes
// elements into a new stream without modifying the original source.
public class Mapping {
	
	public static void main(String[] args) {
		
		IntStream nums = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		
		int[] squares = nums.map(e -> e * e).toArray();
		
		System.out.println("squares" + Arrays.toString(squares));
	}

}
