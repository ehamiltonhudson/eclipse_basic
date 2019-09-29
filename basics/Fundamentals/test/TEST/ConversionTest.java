package hh_ex.TEST;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.*;
import hh_ex.TEST_CLASSES.Conversion;

import org.junit.jupiter.api.Test;

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
