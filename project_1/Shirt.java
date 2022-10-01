package project_1;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

import project_1.Apparel.Condition;

public class Shirt extends Apparel {
	/*
	 * Attributes
	 */

	public enum Size {
		S, M, L, XL
	};

	String text;
	Size size;

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

	public String getText() {
		return text;
	}

	public void setText(String newText) {
		text = newText;
	}
	
	public Size getSize() {
		return size;
	}
	
	public static void setSize(Size newSize) {
		size = newSize;
	}
	
	/* 
	 * Overriding the toString function 
	 * @param no parameters
	 * @return a string using attributes from the Shirt class 
	 */

	@Override
	public String toString() {
		if (text != null && !text.equals("")) {
			return "This size " + size + " " + color + " shirt cost $" + purchasePrice + " and is in " + condition
					+ " condition.  It contains the text \"" + text + "\"";
		} else {
			return "This size " + size + " " + color + " shirt cost $" + purchasePrice + " and is in " + condition
					+ " condition.";
		}
	}

	/*
	 * Constructor 1
	 * @param color, purchase price, condition, text, size
	 * @return no return value
	 */

	public Shirt(String color1, double d, Condition con, String text1, Size s) {
		setText(text1);
		setSize(s);
		setColor(color1);
		setPurchasePrice(d);
		setCondition(con);
	}
	
	/*
	 * Constructor 2
	 * @param color, purchase price, condition, size
	 * @return no return value
	 */

	public Shirt(String color1, double d, Condition con, Size s) {
		setSize(s);
		setColor(color1);
		setPurchasePrice(d);
		setCondition(con);
	}
	
	public Shirt() {
		
	};


}
