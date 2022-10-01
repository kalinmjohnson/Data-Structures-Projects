package project8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Expression Tree test methods
 * You should add additional test cases
 * @author gosnat
 * @version Fall 2020
 */

class ExpressionTreesTest {
	private ExpressionTree et;
	
	@BeforeEach
	void setup() {
		et = new ExpressionTree("( 10 * 1 )");
	}

	@Test
	void testEvaluation() {
		assertEquals(10, et.evaluateTree());
	}
	
	@Test
	void testInFix() {
		assertEquals("( 10 * 1 )", et.printInFix());
	}
	
	@Test
	void testPostFix() {
		assertEquals("10 1 *", et.printPostFix());
	}
	
}