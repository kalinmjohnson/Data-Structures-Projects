package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project2.Apparel.Condition;
import project2.Shirt.Size;

class Test3 {

	Shirt shirtT = new Shirt("blue", 4.34, "new", "Bubbles", "medium");
	
	@Test
	void vCol() {
		assertEquals(shirtT.getColor(), "blue");
	}
		
	@Test
	void vP() {
		assertEquals(shirtT.getPurchasePrice(), 4.34);
	}
		
	@Test
	void vC() {
		assertEquals(shirtT.getCondition(), Condition.NEW);
	}
		
	@Test
	void vT() {
		assertEquals(shirtT.getText(), "Bubbles");
	}
	
	@Test
	void vS() {
		assertEquals(shirtT.getSize(), Size.M);
	}

}
