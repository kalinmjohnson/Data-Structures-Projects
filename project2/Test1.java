package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project2.Apparel.Condition;

class Test1 {

	Pants pantsT = new Pants("blue", 4.34, "new", 31, 32);
		
	@Test
	void vCol() {
		assertEquals(pantsT.getColor(), "blue");
	}
		
	@Test
	void vP() {
		assertEquals(pantsT.getPurchasePrice(), 4.34);
	}
		
	@Test
	void vC() {
		assertEquals(pantsT.getCondition(), Condition.NEW);
	}
		
	@Test
	void vW() {
		assertEquals(pantsT.getWaistM(), 31);
	}
	
	@Test
	void vI() {
		assertEquals(pantsT.getInseamM(), 32);
	}

}



