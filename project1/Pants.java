package project1;

//import project1.Apparel.Condition;
//import project1.Shirt.Size;

public class Pants extends Apparel {
	double waistM;
	double inseamM;
	
	public double getWaistM(){
		   return waistM;
	}
	public double getInseamM(){
		   return inseamM;
	}
	public void setWaistM(double newWaistM){
	    if(newWaistM >= 0){
	    	waistM = newWaistM;
	    }
	}
	public void setInseamM(double newInseamM){
	    if(newInseamM >= 0){
	    	inseamM = newInseamM;
	    }
	}
	
	public Pants(String color1, double d, Condition con, double waist, double inseam) {
		if (waist >= 0) {
			waistM = waist;
		}
		if (inseam >= 0) {
			inseamM = inseam;
		}
		color = color1;
		purchasePrice = d;
		condition = con;
	}
	
	@Override
	public String toString() {
		return "This " + color + " pair of pants has a " + waistM + " inch waist and a " + inseamM + " inch inseam.  It cost " + purchasePrice + " and is in " + condition + " condition.";
	}
	
}
