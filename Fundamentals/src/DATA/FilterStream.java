package hh_ex.DATA;

import java.util.Arrays;
import java.util.stream.IntStream;

// the filter() method will filter streams of data
// returning a stream consisting of the elements
// of a stream that match the given predicate.
public class FilterStream {
	
	public static void main(String[] args) {
		IntStream nums = IntStream.range(0, 25);
		
		int[] vals = nums.filter(e -> e > 15).toArray();
		System.out.print(Arrays.toString(vals));


//		int[] evens = nums.filter(e -> e % 2 == 0).toArray();
//		String evenString = Arrays.toString(evens);
//		System.out.print(evenString);
	}

}
