package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test8 {
	
	Shirt shirtT = new Shirt("red", 4.34, "new", "Bubbles", "medium");
	
	@Test
	void ISS1() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			shirtT.setColor("");
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void ISS2() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			shirtT.setColor(null);
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void ISS3() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			shirtT.setPurchasePrice(-13.45);
		});
		assertEquals("The purchase price must be a positive number", exception.getMessage());
	}
	
	@Test
	void ISS4() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			shirtT.setCondition(null);
		});
		assertEquals("The condition can't be null", exception.getMessage());
	}
	
	@Test
	void ISS5() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			shirtT.setSize(null);
		});
		assertEquals("The size can't be null", exception.getMessage());
	}

}
