package hh_ex.DATA;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


// External iteration (also known as active or
// explicit iteratin, is handled by the
// programmer using for and while loops
public class ExternalIteration {
	
	public static void main(String[] args) {
		
		List<String> myChart = Arrays.asList("Leo", "Sagittarius", "Capricorn", "Virgo", "Cancer", "Scorpio");
		
//		Iterator astroItr = myChart.iterator();
//		Use the version below -- ^^ works but throws friendly warning: 
//		"Iterator is a raw type. References to generic type Iterator<E> should be parameterized"

		Iterator<String> astroItr = myChart.iterator();
		
		while (astroItr.hasNext()) {
			System.out.println(astroItr.next());
		}
	}

}
