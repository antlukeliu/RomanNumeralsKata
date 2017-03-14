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
	
	@Test
	public void testForTwentiesandThirties() {

		assertEquals(20, RtAConverter.convert("XX"));
		assertEquals(24, RtAConverter.convert("XXIV"));
		assertEquals(25, RtAConverter.convert("XXV"));
		assertEquals(30, RtAConverter.convert("XXX"));
		assertEquals(32, RtAConverter.convert("XXXII"));
		assertEquals(38, RtAConverter.convert("XXXVIII"));
		assertEquals(39, RtAConverter.convert("XXXIX"));

	}
	
	@Test
	public void testForL() {

		assertEquals(50, RtAConverter.convert("L"));
	}
	
	@Test
	public void testForXL() {

		assertEquals(40, RtAConverter.convert("XL"));
	}
	
	@Test
	public void testForXLI() {

		assertEquals(41, RtAConverter.convert("XLI"));
	}
	
	@Test
	public void testForXLtoL() {

		assertEquals(42, RtAConverter.convert("XLII"));
		assertEquals(43, RtAConverter.convert("XLIII"));
		assertEquals(44, RtAConverter.convert("XLIV"));
		assertEquals(45, RtAConverter.convert("XLV"));
		assertEquals(46, RtAConverter.convert("XLVI"));
		assertEquals(47, RtAConverter.convert("XLVII"));
		assertEquals(48, RtAConverter.convert("XLVIII"));
		assertEquals(49, RtAConverter.convert("XLIX"));
		
	}
	
	@Test
	public void testForLtoLX() {

		assertEquals(51, RtAConverter.convert("LI"));
		assertEquals(52, RtAConverter.convert("LII"));
		assertEquals(53, RtAConverter.convert("LIII"));
		assertEquals(54, RtAConverter.convert("LIV"));
		assertEquals(55, RtAConverter.convert("LV"));
		assertEquals(56, RtAConverter.convert("LVI"));
		assertEquals(58, RtAConverter.convert("LVIII"));
		assertEquals(59, RtAConverter.convert("LIX"));
		
	}
	
	@Test
	public void testForLX() {

		assertEquals(61, RtAConverter.convert("LXI"));
		assertEquals(62, RtAConverter.convert("LXII"));
		assertEquals(63, RtAConverter.convert("LXIII"));
		assertEquals(64, RtAConverter.convert("LXIV"));
		assertEquals(65, RtAConverter.convert("LXV"));
		assertEquals(66, RtAConverter.convert("LXVI"));
		assertEquals(68, RtAConverter.convert("LXVIII"));
		assertEquals(69, RtAConverter.convert("LXIX"));
		
	}
	
	@Test
	public void testForLXX() {

		assertEquals(71, RtAConverter.convert("LXXI"));
		assertEquals(72, RtAConverter.convert("LXXII"));
		assertEquals(73, RtAConverter.convert("LXXIII"));
		assertEquals(74, RtAConverter.convert("LXXIV"));
		assertEquals(75, RtAConverter.convert("LXXV"));
		assertEquals(76, RtAConverter.convert("LXXVI"));
		assertEquals(78, RtAConverter.convert("LXXVIII"));
		assertEquals(79, RtAConverter.convert("LXXIX"));
		
	}
	
	@Test
	public void testForLXXX() {

		assertEquals(81, RtAConverter.convert("LXXXI"));
		assertEquals(82, RtAConverter.convert("LXXXII"));
		assertEquals(83, RtAConverter.convert("LXXXIII"));
		assertEquals(84, RtAConverter.convert("LXXXIV"));
		assertEquals(85, RtAConverter.convert("LXXXV"));
		assertEquals(86, RtAConverter.convert("LXXXVI"));
		assertEquals(88, RtAConverter.convert("LXXXVIII"));
		assertEquals(89, RtAConverter.convert("LXXXIX"));
		
	}
	
	@Test
	public void testForC() {

		assertEquals(100, RtAConverter.convert("C"));
	}
	
	@Test
	public void testForXC() {

		assertEquals(90, RtAConverter.convert("XC"));
	}
	
	@Test
	public void testForXCI() {

		assertEquals(91, RtAConverter.convert("XCI"));
		assertEquals(92, RtAConverter.convert("XCII"));
		assertEquals(93, RtAConverter.convert("XCIII"));
		assertEquals(94, RtAConverter.convert("XCIV"));
		assertEquals(95, RtAConverter.convert("XCV"));
		assertEquals(96, RtAConverter.convert("XCVI"));
		assertEquals(98, RtAConverter.convert("XCVIII"));
		assertEquals(99, RtAConverter.convert("XCIX"));
		
	}
	
	@Test
	public void testForCC() {

		assertEquals(200, RtAConverter.convert("CC"));
	}
	
	@Test
	public void testForD() {

		assertEquals(500, RtAConverter.convert("D"));
	}
	
	

}
