package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test4 {

	@Test
	void IS1() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Shirt shirtT = new Shirt("", 4.34, "new", "Bubbles", "medium");
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void IS2() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Shirt shirtT = new Shirt(null, 4.34, "new", "Bubbles", "medium");
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void IS3() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Shirt shirtT = new Shirt("blue", -4.34, "new", "Bubbles", "medium");
		});
		assertEquals("The purchase price must be a positive number", exception.getMessage());
	}
	
	@Test
	void IS4() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Shirt shirtT = new Shirt("blue", 4.34, null, "Bubbles", "medium");
		});
		assertEquals("The condition can't be null", exception.getMessage());
	}
	
	@Test
	void IS5() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Shirt shirtT = new Shirt("blue", 4.34, "new", "Bubbles", null);
		});
		assertEquals("The size can't be null", exception.getMessage());
	}

}
