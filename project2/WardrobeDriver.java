package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;

/**
 * 
 * @author kalinjohnson
 * @version 1.1.a
 */

import java.util.Scanner;

//import project2.Apparel;
//import project2.Apparel.Condition;
//import project2.Shirt.Size;

public class WardrobeDriver {
	public static void main(String[] args) {
		ArrayList<Apparel> closet = new ArrayList<Apparel>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        

		/*
		 * For Shirts: String con, String text1, String s
		 * For Pants: String con, int waist, int inseam
		 * 
		 */
		
		
			String c = "";
			double p = 0;
			boolean z = true;
			
			/*
			 * Make 5 instances of the Apparel class
			 * 3 Shirts
			 * 2 Pants
			 */
			
			Shirt shirt1 = new Shirt("good", "Bubbles", "medium");
			Shirt shirt2 = new Shirt("poor", "Tubbs", "large");
			Shirt shirt3 = new Shirt("poor", "small");
			Pants pants1 = new Pants("good", 32, 34);
			Pants pants2 = new Pants("new", 31, 32);
			
			/*
			 * within each while loop: 
			 * 	take input from user
			 * 	catch exceptions
			 * 	set color and purchase price
			 * 	if done without error, then continue to next instance
			 */
				
			while (z == true) {
				
				try {
					System.out.println("What is the color of the shirt?");
					c = input.nextLine();
				
					System.out.println("What is the purchase price of the  shirt?");
					p = input.nextDouble();
					input.nextLine();
				} catch (InputMismatchException iae) {
					System.out.println("Your answer is not a valid input");
					input.nextLine();
					continue;
				}
				
				try {
					shirt1.setColor(c);
				} catch (IllegalArgumentException iae) {
					System.out.println("The color cannot be empty or null");
					continue;
				}
				try {
					shirt1.setPurchasePrice(p);
				} catch (IllegalArgumentException iae) {
					System.out.println("The purchase price must be a positive number");
					continue;
				}
				z = false;
			}
		
			z = true;
			while (z == true) {
				
				try {
					System.out.println("What is the color of the shirt?");
					c = input.nextLine();
				
					System.out.println("What is the purchase price of the shirt?");
					p = input.nextDouble();
					input.nextLine();
				} catch (InputMismatchException iae) {
					System.out.println("Your answer is not a valid input");
					input.nextLine();
					continue;
				}
				
				try {
					shirt2.setColor(c);
				} catch (IllegalArgumentException iae) {
					System.out.println("The color cannot be empty or null");
					continue;
				}
				try {
					shirt2.setPurchasePrice(p);
				} catch (IllegalArgumentException iae) {
					System.out.println("The purchase price must be a positive number");
					continue;
				}
				z = false;
			}
			z = true;
		
			while (z == true) {
			
				try {
					System.out.println("What is the color of the shirt?");
					c = input.nextLine();
				
					System.out.println("What is the purchase price of the shirt?");
					p = input.nextDouble();
					input.nextLine();
				} catch (InputMismatchException iae) {
					System.out.println("Your answer is not a valid input");
					input.nextLine();
					continue;
				}
				
				try {
					shirt3.setColor(c);
				} catch (IllegalArgumentException iae) {
					System.out.println("The color cannot be empty or null");
					continue;
				}
				try {
					shirt3.setPurchasePrice(p);
				} catch (IllegalArgumentException iae) {
					System.out.println("The purchase price must be a positive number");
					continue;
				}
				z = false;
			}
			z = true;
			
			while (z == true) {
			
				try {
					System.out.println("What is the color of the pants?");
					c = input.nextLine();
				
					System.out.println("What is the purchase price of the pants?");
					p = input.nextDouble();
					input.nextLine();
				} catch (InputMismatchException iae) {
					System.out.println("Your answer is not a valid input");
					input.nextLine();
					continue;
				}
				
				try {
					pants1.setColor(c);
				} catch (IllegalArgumentException iae) {
					System.out.println("The color cannot be empty or null");
					continue;
				}
				try {
					pants1.setPurchasePrice(p);
				} catch (IllegalArgumentException iae) {
					System.out.println("The purchase price must be a positive number");
					continue;
				}
				z = false;
			}
			z = true;
			
			while (z == true) {
			
				try {
					System.out.println("What is the color of the pants?");
					c = input.nextLine();
				
					System.out.println("What is the purchase price of the pants?");
					p = input.nextDouble();
					input.nextLine();
				} catch (InputMismatchException iae) {
					System.out.println("Your answer is not a valid input");
					input.nextLine();
					continue;
				}
				
				try {
					pants2.setColor(c);
				} catch (IllegalArgumentException iae) {
					System.out.println("The color cannot be empty or null");
					continue;
				}
				try {
					pants2.setPurchasePrice(p);
				} catch (IllegalArgumentException iae) {
					System.out.println("The purchase price must be a positive number");
					continue;
				}
				z = false;
			}
			
		/*
		 * Add the five instances of apparel to the arrayList, closet
		 */
		
		
		closet.add(shirt1);
		closet.add(shirt2);
		closet.add(shirt3);
		closet.add(pants1);
		closet.add(pants2);
		
		/*
		 * sort the arrayList, closet
		 */


        Collections.sort(closet);

		/*
		 * Printing out the data about the different shirts and pairs of pants
		 */
		
		Iterator<Apparel> it = closet.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
