package implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void testSum() {
		SimpleCalculator sc = new SimpleCalculator();
		assertEquals(4, sc.add(2, 2));
		
	}
	
	@Test
	void threePlusSevenEqualsTen() {
		SimpleCalculator sc = new SimpleCalculator();
		assertTrue(sc.add(2, 2) == 10);
	}

}
