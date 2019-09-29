package fundamentals.DATA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// uses the collect() method to group data
public class Collecting2 {
	
	public static void main(String[] args) {
		
		List<String> momsChart = Arrays.asList("Virgo", "Sagittarius", "Virgo", "Virgo", "Libra", "Virgo", "Libra", "Sagittarius", "Leo", "Scorpio", "Virgo");
		
		Map<String, Long> result = momsChart.stream().collect(
				Collectors.groupingBy(
						Function.identity(), Collectors.counting()
				));
		for (Map.Entry<String, Long> entry : result.entrySet()) {
			
			String key = entry.getKey();
			Long value = entry.getValue();
			
			System.out.format("%s: %d%n", key, value);
		}
	}

}