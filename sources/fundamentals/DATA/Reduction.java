package fundamentals.DATA;

import java.util.stream.IntStream;

// a *reduction* is a terminal operation that
// aggregates a stream into a type or a primitive
public class Reduction {
	
	public static void main(String[] args) {
		
		IntStream nums = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		int maxValue = nums.max().getAsInt();
//		With the max() method, we get the maximum element of the stream. 
//		The method returns an Optional from which we get the integer via getAsInt().
		System.out.printf("The maximum value is: %d%n", maxValue);
	}

}
