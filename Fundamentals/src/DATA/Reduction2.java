package hh_ex.DATA;

import java.util.stream.IntStream;

// a custom reduction can be created with the reduce() method
public class Reduction2 {
	
	public static void main(String[] args) {
		
		IntStream nums = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
		int product = nums.reduce((a, b) -> a * b).getAsInt();
		System.out.printf("The product is: %d%n", product);
	}

}
