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
	public void testforOne() {

		assertEquals("Test1 didn't work", "I", converter.convert("1"));
	}

	@Test
	public void testforTwo() {

		assertEquals("Test2 didn't work", "II", converter.convert("2"));
	}
	
	@Test
	public void testforThree() {

		assertEquals("Test3 didn't work", "III", converter.convert("3"));
	}
	
	@Test
	public void testforFour() {

		assertEquals("Test4 didn't work", "IV", converter.convert("4"));
	}
	
	@Test
	public void testforFiveThroughEight() {

		assertEquals("Test5 didn't work", "V", converter.convert("5"));
		assertEquals("Test5 didn't work", "X", converter.convert("10"));
		
	}
	@Test
	public void testforNines() {

		assertEquals("IX", converter.convert("9"));
		assertEquals("XIX", converter.convert("19"));
		
	}
	
}