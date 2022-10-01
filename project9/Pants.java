package project9;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

//import project2.Apparel.Condition;
//import project2.Shirt.Size;

public class Pants extends Apparel {

	/*
	 * Attributes
	 */

	protected int waistM;
	protected int inseamM;

	/*
	 * Methods
	 */

	/**
	 * Setters and Getters for Attributes of Shirt
	 * 
	 * The settters, which can be determined from their name, have
	 * 
	 * @param the new value to replace the old value
	 * @return no return value
	 * 
	 *         The getters, which can be determined from their name, have
	 * @param no parameters
	 * @return the data stored within the variable
	 **/

	public double getWaistM() {
		return waistM;
	}

	public double getInseamM() {
		return inseamM;
	}

	public void setWaistM(int newWaistM) throws IllegalArgumentException {
		if (newWaistM <= 0) {
			throw new IllegalArgumentException("The waist measurement must be 0 or a positive number");
		}
		waistM = newWaistM;

	}

	public void setInseamM(int newInseamM) throws IllegalArgumentException {
		if (newInseamM <= 0) {
			throw new IllegalArgumentException("The inseam measurement must be 0 or a positive number");
		}
		inseamM = newInseamM;
	}

	/*
	 * Overriding the toString function
	 * 
	 * @param no parameters
	 * 
	 * @return a string using attributes from the Shirt class
	 */

	@Override
	public String toString() {
		return "This " + color + " pair of pants has a " + waistM + " inch waist and a " + inseamM
				+ " inch inseam.  It cost $" + purchasePrice + " and is in " + condition + " condition.";
	}

	/*
	 * Constructor 1
	 * 
	 * @param color, purchase price, condition, waist measurement, inseam
	 * measurement 
	 * 
	 * @return no return value
	 */

	public Pants(String color1, double d, Condition con, int waist, int inseam) {
		setWaistM(waist);
		setInseamM(inseam);
		setColor(color1);
		setPurchasePrice(d);
		setCondition(con);
	}
	
	/*
	 * Constructor 2
	 * 
	 * @param condition, waist measurement, inseam
	 * measurement
	 * 
	 * @return no return value
	 */
	
	public Pants(Condition con, int waist, int inseam) {
		setWaistM(waist);
		setInseamM(inseam);
		setCondition(con);
	}

	
}