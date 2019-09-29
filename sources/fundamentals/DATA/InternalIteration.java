package fundamentals.DATA;

import java.util.Arrays;
import java.util.List;


public class InternalIteration {
	
	public static void main(String[] args) {
		
		List<String> evasChartWords = Arrays.asList("Taurus", "Scorpio", "Aries", "Pisces", "Aquarius", "Virgo", "Capricorn", "Scorpio");
		
		evasChartWords.parallelStream().forEach(System.out::println);
				
	}

}
