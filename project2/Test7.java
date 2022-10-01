package project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project2.Apparel.Condition;
import project2.Shirt.Size;

class Test7 {

	Shirt shirtT = new Shirt("blue", 4.34, "new", "Bubbles", "medium");
	
	@Test
	void vSC() {
		shirtT.setColor("green");
		assertEquals(shirtT.getColor(), "green");
	}
	
	@Test
	void vSP() {
		shirtT.setPurchasePrice(8.92);
		assertEquals(shirtT.getPurchasePrice(), 8.92);
	}
	
	@Test
	void vSCon() {
		shirtT.setCondition("poor");
		assertEquals(shirtT.getCondition(), Condition.POOR);
	}
	
	@Test
	void vSW() {
		shirtT.setText("Mountains");
		assertEquals(shirtT.getText(), "Mountains");
	}
	
	@Test
	void vSI() {
		shirtT.setSize("small");
		assertEquals(shirtT.getSize(), Size.S);
	}


}
