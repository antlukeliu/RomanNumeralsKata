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
	@Test
	public void testForX() {

		assertEquals(10, RtAConverter.convert("X"));
	}
	
	@Test
	public void testFor10s() {

		assertEquals(11, RtAConverter.convert("XI"));
		assertEquals(12, RtAConverter.convert("XII"));
		assertEquals(13, RtAConverter.convert("XIII"));
		assertEquals(14, RtAConverter.convert("XIV"));
		assertEquals(15, RtAConverter.convert("XV"));
		assertEquals(16, RtAConverter.convert("XVI"));
		assertEquals(17, RtAConverter.convert("XVII"));
		assertEquals(18, RtAConverter.convert("XVIII"));
		assertEquals(19, RtAConverter.convert("XIX"));
		
	}
	

}
