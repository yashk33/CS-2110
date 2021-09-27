/*
 * Cohort Group 4: Shriman S, Edward L, Hickson F, Yash K
 *  9/30/2020 5:30PM
*/
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class InClass13Test {

	@Test
	public void powerTest1() {
		// Zero Exponent Test
		assertEquals(1.0 , InClass13.power(1.5, 0), 0.000001);
	}

	@Test
	public void powerTest2() {
	// Positive Exponenet Test
	assertEquals(0.125, InClass13.power(0.5, 3), 0.000001);
	}

	@Test
	public void powerTest3() {
	// Negative Exponent Test
		assertEquals(16, InClass13.power( 0.5, -4), 0.000001);
	}

}
