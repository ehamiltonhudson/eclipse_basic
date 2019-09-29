package fundamentals.DATA;

import java.util.Comparator;
import java.util.stream.Stream;

// The Stream.of() method returns a sequential ordered
// stream whose elements are the specified values.
public class CreatingStreams3 {
	
	public static void main(String[] args) {
		Stream<String> colors = Stream.of("purple", "green", "black");
		String col = colors.skip(2).findFirst().get();
		System.out.println(col);
		
		Stream<Integer> nums = Stream.of(3, 4,5, 6, 7);
		int maxVal = nums.max(Comparator.naturalOrder()).get();
		System.out.println(maxVal);
	}

}
