import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsConverterTest {
	
	RomanNumeralsConverter converter;

	@Before
	public void setUp(){
		converter = new RomanNumeralsConverter();
	}
	

	// Test to see if enter 1 it converts to I
	@Test
	public void testForOne() {

		assertEquals("Test1 didn't work", "I", converter.convert("1"));
	}

	@Test
	public void testForTwo() {

		assertEquals("Test2 didn't work", "II", converter.convert("2"));
	}
	
	@Test
	public void testForThree() {

		assertEquals("Test3 didn't work", "III", converter.convert("3"));
	}
	
	@Test
	public void testForFour() {

		assertEquals("Test4 didn't work", "IV", converter.convert("4"));
	}
	
	@Test
	public void testForFiveThroughEight() {

		assertEquals("Test5 didn't work", "V", converter.convert("5"));
		assertEquals("Test5 didn't work", "X", converter.convert("10"));
		
	}
	@Test
	public void testForNines() {

		assertEquals("IX", converter.convert("9"));
		assertEquals("XIX", converter.convert("19"));
		
	}
	@Test
	public void testForFourtyandFifty() {

		assertEquals("XL", converter.convert("40"));
		assertEquals("L", converter.convert("50"));
		
	}
	@Test
	public void testforSixtyThroughEighty() {

		assertEquals("LXII", converter.convert("62"));
		assertEquals("LXXV", converter.convert("75"));
		assertEquals("LXXXIV", converter.convert("84"));	
	}
	
	@Test
	public void testForNinety() {

		assertEquals("XC", converter.convert("90"));
		assertEquals("XCIV", converter.convert("94"));
		assertEquals("XCV", converter.convert("95"));
		assertEquals("XCIX", converter.convert("99"));	
	}
	
}