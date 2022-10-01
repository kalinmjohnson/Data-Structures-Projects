package project2;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

public abstract class Apparel implements Comparable<Apparel> {

	/*
	 * Attributes
	 * 
	 * The first one is for the color and the second one is the price it was
	 * purchases at
	 */

	protected String color = "";
	protected double purchasePrice;

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

	protected Condition condition;

	/*
	 * Methods
	 */

	/**
	 * Setters and Getters for Attributes of Apparel
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
	
	public String getColor() {
		return color;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setColor(String newColor) throws IllegalArgumentException {
		if (newColor == null || newColor.equals("")) {
			throw new IllegalArgumentException("The color can't be null or nothing");
		}
		color = newColor;
	}

	public void setCondition(String newCondition) throws IllegalArgumentException {
		if (newCondition == null) {
			throw new IllegalArgumentException("The condition can't be null");
		}
		if (newCondition.equals("new")) {
			condition = Condition.NEW;
		} else if (newCondition.equals("good")) {
			condition = Condition.GOOD;
		} else if (newCondition.equals("poor")) {
			condition = Condition.POOR;
		} else if (newCondition.equals("trashed")) {
			condition = Condition.TRASHED;
		}
	}

	public void setPurchasePrice(double newPurchasePrice) throws IllegalArgumentException {
		if (newPurchasePrice < 0) {
			throw new IllegalArgumentException("The purchase price must be a positive number");
		}
		purchasePrice = newPurchasePrice;
	}
	
	/*
	 * the compareTo method is used the the sort method in the Wardrobe Driver
	 * 
	 * @param Apparel object
	 * @return an integer
	 * 
	 */

	@Override
	public int compareTo(Apparel other) {
		if(this.condition.equals(other.condition)) {
			if(this.purchasePrice < other.purchasePrice) return -1;
			else return 1;
		}	
		return this.condition.compareTo(other.condition);
		
	}

}
