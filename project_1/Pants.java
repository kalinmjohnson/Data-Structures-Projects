package project_1;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

import project_1.Apparel.Condition;
import project_1.Shirt.Size;

public class Pants extends Apparel {

	/*
	 * Attributes
	 */

	int waistM;
	int inseamM;

	/*
	 * Methods
	 */
	
	/** Setters and Getters for Attributes of Shirt 
	 * 
	 * The settters, which can be determined from their name, have
	 * @param the new value to replace the old value
	 * @return no return value
	 * 
	 * The getters, which can be determined from their name, have
	 * @param no parameters
	 * @return the data stored within the variable
	 * **/

	public double getWaistM() {
		return waistM;
	}

	public double getInseamM() {
		return inseamM;
	}

	public void setWaistM(int newWaistM) {
		if (newWaistM >= 0) {
			waistM = newWaistM;
		}
	}

	public void setInseamM(int newInseamM) {
		if (newInseamM >= 0) {
			inseamM = newInseamM;
		}
	}
	
	/* 
	 * Overriding the toString function 
	 * @param no parameters
	 * @return a string using attributes from the Shirt class 
	 */

	@Override
	public String toString() {
		return "This " + color + " pair of pants has a " + waistM + " inch waist and a " + inseamM
				+ " inch inseam.  It cost $" + purchasePrice + " and is in " + condition + " condition.";
	}

	/*
	 * Constructor
	 * @param color, purchase price, condition, waist measurement, inseam measurement
	 * @return no return value
	 */

	public Pants(String color1, double d, Condition con, int waist, int inseam) {
		setWaistM(waist);
		setInseamM(inseam);
		setColor(color1);
		setPurchasePrice(d);
		setCondition(con);
	}
	
	public Pants() {
		
	};

}
