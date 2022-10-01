package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project2.Apparel.Condition;

class Test5 {

	Pants pantsT = new Pants("blue", 4.34, "new", 31, 32);
	
	@Test
	void vSC() {
		pantsT.setColor("red");
		assertEquals(pantsT.getColor(), "red");
	}
	
	@Test
	void vSP() {
		pantsT.setPurchasePrice(5.64);
		assertEquals(pantsT.getPurchasePrice(), 5.64);
	}
	
	@Test
	void vSCon() {
		pantsT.setCondition("poor");
		assertEquals(pantsT.getCondition(), Condition.POOR);
	}
	
	@Test
	void vSW() {
		pantsT.setWaistM(29);
		assertEquals(pantsT.getWaistM(), 29);
	}
	
	@Test
	void vSI() {
		pantsT.setInseamM(30);
		assertEquals(pantsT.getInseamM(), 30);
	}

}
