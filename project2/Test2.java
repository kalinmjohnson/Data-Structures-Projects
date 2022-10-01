package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	void IP1() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants("", 4.34, "new", 31, 32);
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void IP2() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants(null, 4.34, "new", 31, 32);
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void IP3() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants("blue", -8.65, "new", 31, 32);
		});
		assertEquals("The purchase price must be a positive number", exception.getMessage());
	}
	
	@Test
	void IP4() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants("blue", 8.65, null, 31, 32);
		});
		assertEquals("The condition can't be null", exception.getMessage());
	}
	
	@Test
	void IP5() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants("blue", 8.65, "new", -31, 32);
		});
		assertEquals("The waist measurement must be 0 or a positive number", exception.getMessage());
	}
	
	@Test
	void IP6() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants("blue", 8.65, "new", 0, 32);
		});
		assertEquals("The waist measurement must be 0 or a positive number", exception.getMessage());
	}

	
	@Test
	void IP7() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants("blue", 8.65, "new", 31, -32);
		});
		assertEquals("The inseam measurement must be 0 or a positive number", exception.getMessage());
	}

	
	@Test
	void IP8() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Pants pantsT = new Pants("blue", 8.65, "new", 31, 0);
		});
		assertEquals("The inseam measurement must be 0 or a positive number", exception.getMessage());
	}


}
