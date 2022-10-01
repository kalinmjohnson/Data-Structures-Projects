package project_1;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

import project_1.Apparel.Condition;
import project_1.Shirt.Size;
import java.util.Scanner;

public class Wardrobe_Driver {
	public static void main(String[] args) {
		Apparel[] apparelArray = new Apparel[5];
		Scanner input = new Scanner(System.in);

		/*
		 * For Shirts: String color1, float price, Condition con, String text1, Size s
		 * For Pants: String color1, float price, Condition con, float waist, float
		 * inseam
		 * 
		 */
		
		for(int i = 0; i<5; i++) {
			System.out.println("Is the item a shirt or a pair of pants? (shirt or pants)");
			String x = input.nextLine();
			if (x == "shirt" || x == "Shirt") {
				apparelArray[i] = new Shirt();
				
				//set color
				System.out.println("What is the color of the shirt?");
				String c = input.nextLine();
				Shirt.setColor(c);
				
				//set price
				System.out.println("What is the purchase price of the shirt?");
				double p = input.nextDouble();
				Shirt.setPurchasePrice(p);
				
				//set condition
				System.out.println("What is the condition of the shirt?");
				Condition con = input.nextLine();
				Shirt.setCondition(con);
				
				//set condition
				System.out.println("What is the size of the shirt?");
				Size s = input.nextLine();
				Shirt.setSize(s);
				
				//ask if text, and if so, set text
				System.out.println("Does the shirt have text on it? (yes or no)");
				String textQ = input.nextLine();
				if (textQ.equals("yes") {
					boolean tq == true
				}
				
				if (tq == true)
				
				
			} else if (x == "pants" || x == "Pants" || x == "pair of pants") {
				apparelArray[i] = new Pants();
			} else {
				System.out.println("Your answer isn't one of the options");
				i--;
			}
		}

		/*
		 * Printing out the data about the different shirts and pairs of pants
		 */

		System.out.println(apparelArray[0]);
		System.out.println(apparelArray[1]);
		System.out.println(apparelArray[2]);
		System.out.println(apparelArray[3]);
		System.out.println(apparelArray[4]);
	}
}
