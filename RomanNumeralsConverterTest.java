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
	public void testForTwentyandThirty() {

		assertEquals("XX", converter.convert("20"));
		assertEquals("XXX", converter.convert("30"));
		
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
	
	@Test
	public void testForHundreds() {

		assertEquals("C", converter.convert("100"));
		assertEquals("CIV", converter.convert("104"));
		assertEquals("CL", converter.convert("150"));
		assertEquals("CXCVI", converter.convert("196"));	
	}
	
	//Problem I run into is array always goes to index of one instead back to zero
	@Test
	public void testForTwoHundredsAndThreeHundreds() {

		assertEquals("CC", converter.convert("200"));
		assertEquals("CCXXXIV", converter.convert("234"));
		assertEquals("CCCL", converter.convert("350"));
		assertEquals("CCCXCVI", converter.convert("396"));	
	}
	
	@Test
	public void testForFourHundreds() {

		assertEquals("CD", converter.convert("400"));
		assertEquals("CDXXXIV", converter.convert("434"));
		assertEquals("CDL", converter.convert("450"));
		assertEquals("CDXCVI", converter.convert("496"));	
	}
	
	@Test
	public void testForFiveHundreds() {

		assertEquals("D", converter.convert("500"));
		assertEquals("DXXXIV", converter.convert("534"));
		assertEquals("DL", converter.convert("550"));
		assertEquals("DXCVI", converter.convert("596"));	
	}
	
	@Test
	public void testForSixHundredsToEightHundreds() {

		assertEquals("DC", converter.convert("600"));
		assertEquals("DCXXXIV", converter.convert("634"));
		assertEquals("DCC", converter.convert("700"));
		assertEquals("DCCL", converter.convert("750"));
		assertEquals("DCCC", converter.convert("800"));
		assertEquals("DCCCXCVI", converter.convert("896"));	
	}
	
	
}