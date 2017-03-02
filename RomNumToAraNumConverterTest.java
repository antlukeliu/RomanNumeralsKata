import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomNumToAraNumConverterTest {
	
	RomNumToAraNumConverter RtAConverter;
	
	@Before
	public void setUp() throws Exception {
		RtAConverter = new RomNumToAraNumConverter(); 
	}

	@Test
	public void testForI() {

		assertEquals(1, RtAConverter.convert("I"));
	}
	
	@Test
	public void testForII() {

		assertEquals(2, RtAConverter.convert("II"));
	}
	
	@Test
	public void testForIII() {

		assertEquals(3, RtAConverter.convert("III"));
	}
	
	@Test
	public void testForV() {

		assertEquals(5, RtAConverter.convert("V"));
	}
	
	@Test
	public void testForIV() {

		assertEquals(4, RtAConverter.convert("IV"));
	}
	
	@Test
	public void testForSixThruEight() {

		assertEquals(6, RtAConverter.convert("VI"));
		assertEquals(7, RtAConverter.convert("VII"));
		assertEquals(8, RtAConverter.convert("VIII"));
	}
	@Test
	public void testForIX() {

		assertEquals(9, RtAConverter.convert("IX"));
	}
	

}
