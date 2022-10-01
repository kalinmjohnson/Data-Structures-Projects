package project_1;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

public abstract class Apparel {

	/*
	 * Attributes
	 * 
	 * The first one is for the color and the second one is the price it was purchases at
	 */

	String color = "";
	double purchasePrice;

	/** Allowed Conditions of the clothing **/
	public enum Condition {
		NEW("new"), GOOD("good"), POOR("poor"), TRASHED("trashed");

		private final String mCond;

		Condition(String cond) {
			mCond = cond;
		}

		public String toString() {
			return mCond;
		}
	};

	Condition condition;

	/*
	 * Methods
	 */

	/** Setters and Getters for Attributes of Apparel 
	 * 
	 * The settters, which can be determined from their name, have
	 * @param the new value to replace the old value
	 * @return no return value
	 * 
	 * The getters, which can be determined from their name, have
	 * @param no parameters
	 * @return the data stored within the variable
	 * **/
	public String getColor() {
		return color;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public Condition getCondition() {
		return condition;
	}

	public static void setColor(String newColor) {
		color = newColor;
	}

	public static void setCondition(Condition newCondition) {
		condition = newCondition;
	}

	public static void setPurchasePrice(double newPurchasePrice) {
		if (newPurchasePrice >= 0) {
			purchasePrice = newPurchasePrice;
		}
	}

}
