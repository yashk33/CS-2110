/*
 * Cohort Group 4: Shriman S, Edward L, Hickson F, Yash K
 * 9/30/2020 5PM
*/
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PancakeMakerTest {

	@Test
	public void determineWholeFoodsOrderTest1() {
		// Normal Test
		PancakeMaker p = new PancakeMaker();
		String[] normal = { "flour", "soda", "powder", "buttermilk", "egg" };
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("salt");
		assertEquals("Normal Case Failed: ", expected, p.determineWholeFoodsOrder(normal));
	}

	@Test
	public void determineWholeFoodsOrderTest2() {
		// Empty Test
		PancakeMaker p = new PancakeMaker();
		String[] requiredIngredients = { "flour", "salt", "soda", "powder", "buttermilk", "egg" };
		ArrayList<String> result = new ArrayList<String>();
		for (String temp : requiredIngredients) {
			result.add(temp);
		}
		String[] empty = {};
		assertEquals("Empty Case Failed: ", result, p.determineWholeFoodsOrder(empty));
	}

	@Test
	public void determineWholeFoodsOrderTest3() {
		// Full Test
		PancakeMaker p = new PancakeMaker();
		String[] test = { "flour", "salt", "soda", "powder", "buttermilk", "egg" };
		ArrayList<String> answer = new ArrayList<String>();
		assertEquals("Full Case Failed: ", answer, p.determineWholeFoodsOrder(test));
	}
}
