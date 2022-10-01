package project1;

//import project1.Apparel.Condition;
//import project1.Shirt.Size;

public class WardrobeDriver {
	public static void main() {
		Apparel[] apparelArray = new Apparel[5];
		apparelArray[0] = new Shirt("gray", 4.35, Apparel.Condition.GOOD, "Hello", Shirt.Size.M);
		apparelArray[1] = new Shirt("blue", 5.78, Apparel.Condition.GOOD, Shirt.Size.L);
		apparelArray[2] = new Shirt("red", 16.40, Apparel.Condition.GOOD, "Bubbles", Shirt.Size.L);
		apparelArray[3] = new Pants("purple", 4.06, Apparel.Condition.GOOD, 30.0, 32.0);
		apparelArray[4] = new Pants("green", 13.76, Apparel.Condition.GOOD, 30.0, 32.0);
		
		/* For Shirts: String color1, float price, Condition con, String text1, Size s
		 * For Pants: String color1, float price, Condition con, float waist, float inseam
		 * 
		 */
		
		System.out.println(apparelArray[0]);
		System.out.println(apparelArray[1]);
		System.out.println(apparelArray[2]);
		System.out.println(apparelArray[3]);
		System.out.println(apparelArray[4]);
	}
}
