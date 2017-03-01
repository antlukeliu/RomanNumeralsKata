import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsConverterTest {
	
	//Test to see if enter 1 it converts to I
	@Test
	public void testforOne() {
		
		RomanNumeralsConverter converter = new RomanNumeralsConverter();
		assertEquals("Test1 didn't work", "I", converter.convert("1"));
	}
	
	@Test
	public void testforTwo() {
		
		RomanNumeralsConverter converter = new RomanNumeralsConverter();
		assertEquals("Test2 didn't work", "II", converter.convert("2"));
	}
}