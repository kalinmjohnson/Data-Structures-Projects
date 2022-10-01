package project1;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

//import project1.Apparel.Condition;

public class Shirt extends Apparel {
	public enum Size {
		S, M, L, XL
	};

	String text;
	Size size;

	public String getText() {
		return text;
	}

	public void setText(String newText) {
		text = newText;
	}
	
	@Override
	public String toString() {
		if (text != null && !text.equals("")) {
			return "This size " + size + " " + color + " shirt cost " + purchasePrice + " and is in " + condition + " condition.  It contains the text \"" + text + "\"";
		} else {
			return "This size " + size + " " + color + " shirt cost " + purchasePrice + " and is in " + condition + " condition.";
		}
	}

	public Shirt(String color1, double d, Condition con, String text1, Size s) {
		text = text1;
		size = s;
		color = color1;
		purchasePrice = d;
		condition = con;
	}
	
	public Shirt(String color1, double d, Condition con, Size s) {
		size = s;
		color = color1;
		purchasePrice = d;
		condition = con;
	}


}
