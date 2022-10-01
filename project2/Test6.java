package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test6 {

	Pants pantsT = new Pants("blue", 4.34, "new", 31, 32);
	
	@Test
	void IPS1() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setColor("");
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void IPS2() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setColor(null);
		});
		assertEquals("The color can't be null or nothing", exception.getMessage());
	}
	
	@Test
	void IPS3() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setPurchasePrice(-7.54);
		});
		assertEquals("The purchase price must be a positive number", exception.getMessage());
	}
	
	@Test
	void IPS4() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setCondition(null);
		});
		assertEquals("The condition can't be null", exception.getMessage());
	}
	
	@Test
	void IPS5() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setWaistM(-33);
		});
		assertEquals("The waist measurement must be 0 or a positive number", exception.getMessage());
	}
	
	@Test
	void IPS6() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setWaistM(0);
		});
		assertEquals("The waist measurement must be 0 or a positive number", exception.getMessage());
	}
	
	@Test
	void IPS7() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setInseamM(-34);
		});
		assertEquals("The inseam measurement must be 0 or a positive number", exception.getMessage());
	}
	
	@Test
	void IPS8() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			pantsT.setInseamM(0);
		});
		assertEquals("The inseam measurement must be 0 or a positive number", exception.getMessage());
	}
	
	

}
