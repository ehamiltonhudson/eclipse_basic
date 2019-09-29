package fundamentals.TEST;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import fundamentals.CLASSES.Conversion;


class ConversionTest {

	@Test
	public void testTempConversion() throws Throwable {
		//Given
		Conversion underTest = new Conversion();
		
		//When
		double temperature = 80.0d;
		String unit = "";
		double result = underTest.tempConversion(temperature, unit);
		
		//Then - assertions for result f method tempConversion(double, String)
		assertEquals(176.0d, result, 0.0);
	}

}
