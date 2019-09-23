package hh_ex.DATA;

import java.util.Arrays;
import java.util.stream.IntStream;

// the distinct() method returns a stream
// consisting of unique elements
public class UniqueElements {
	
	public static void main(String[] args) {
		
		IntStream nums = IntStream.of(1, 1, 3, 4, 4, 6, 7, 7);
		int a[] = nums.distinct().toArray();
		
		System.out.println(Arrays.toString(a));
	}

}
