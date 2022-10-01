package project1;

public abstract class Apparel {
	
	String color = "";
	double purchasePrice;
	
	/** Allowed Conditions of the clothing **/
	public enum Condition{
		NEW("new"), 
		GOOD("good"), 
		POOR("poor"), 
		TRASHED("trashed");
		private final String mCond;
		Condition(String cond){
			mCond = cond;
		}
		public String toString(){ return mCond; }
	};
	
	Condition condition;
	
	/** Setters and Getters for Attributes of Apparel **/
	public String getColor(){
		   return color;
	}
	public double getPurchasePrice(){
		   return purchasePrice;
	}
	public Condition getCondition(){
		   return condition;
	}
	public void setColor(String newColor){
	    	color = newColor;
	}
	public void setCondition(Condition newCondition){
		condition = newCondition;
	}
	public void setPurchasePrice(float newPurchasePrice){
	    if(newPurchasePrice >= 0){
	    	purchasePrice = newPurchasePrice;
	    }
	}
	
}


