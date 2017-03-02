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

}
