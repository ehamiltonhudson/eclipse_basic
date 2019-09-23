package hh_ex.DATA;

import java.util.stream.Stream;

// transforms a string of strings
public class Mapping2 {
	
	public static void main(String[] args) {
		
		Stream<String> dadsChart = Stream.of("gemini", "aquarius", "scorpio", "aries", "libra", "cancer", "leo");
		dadsChart.map(Mapping2::capitalize).forEach(System.out::println);
	}
	
	private static String capitalize(String word) {
		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		return word;
	}

}
