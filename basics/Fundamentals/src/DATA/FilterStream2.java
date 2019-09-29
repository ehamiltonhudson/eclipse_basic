package hh_ex.DATA;

import java.util.stream.IntStream;

// produces a list of even or odd numbers
public class FilterStream2 {
	
	public static void main(String[] args) {
		
		IntStream nums = IntStream.rangeClosed(0, 30);
		nums.filter(FilterStream2::isEven).forEach(System.out::println);
//		nums.filter(FilterStream2::isOdd).forEach(System.out::println);
	}
	
	private static boolean isEven(int e) {
		return e % 2 == 0;
	}
	
//	private static boolean isOdd(int o) {
//		return o % 2 != 0; 
//	}

}
