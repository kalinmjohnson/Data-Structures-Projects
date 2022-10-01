package project7;

import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import project7.BinaryTree.BTNode;

/**
 * Project 7
 * 
 * 
 * @author Kalin Johnson
 * @version Spring 2022
 *
 */

public class Game {
	
	
	
	
	public static void main(String[] args) {

		/*
		 * Set up Code -Attributes -input -File I/O
		 */

		BinaryTree<String> tree = null;
		BTNode<String> current;
		tree = new BinaryTree<String>();
		current = tree.findRoot();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		boolean cont = true;

		/*
		 * Main Loop that runs until the program is quit
		 */

		while (cont == true) {
			// Setup
			boolean vinput = false;
			current = tree.findRoot();
			System.out.println("Are you thinking of an animal? (Y/N)  Let's see if I can guess it!");
			String contin = input.nextLine();
			if (contin.equals("N")) {
				cont = false;
				continue;
			}
			/*
			 * the loop that continues while the data includes a question
			 */
			while (current.left != null || current.right != null) {
				System.out.println(current.data + " (Y/N)");
				String answer = input.nextLine();
				if (answer.equals("Y")) {
					current = current.right; // I still haven't figured out whether to go with right or left here
				} else if (answer.equals("N")) {
					current = current.left;
				} else {
					System.out.println("Your response must be either Y or N");
				}
			}

			/*
			 * Now the current node is a leaf node where the data is an animal
			 */
			while (vinput == false) {
				System.out.println("You were thinking of a " + current.data + ". Am I correct? (Y/N)");
				String answer = input.nextLine();

				/*
				 * if statement to depending on whether the guess was correct or incorrect
				 */
				if (answer.equals("Y")) {
					System.out.println("Hurray!  I got it!");
					System.out.println("Let's play again!");
					vinput = true;
				} else if (answer.equals("N")) {

					/*
					 * If the guess was wrong, then input the correct animal and a new question
					 */

					System.out.println("Darn! What animal were you thinking of?");
					String newAnimal = input.nextLine();
					String oldAnimal = current.data;
					System.out.println("What is a question that has an answer of yes for a " + oldAnimal
							+ " and no for a " + newAnimal + "?");

					/*
					 * Now create two new nodes and improve the tree
					 */
					current.data = input.nextLine();
					System.out.println("Let's try again!");
					tree.addRight(oldAnimal, current); // I still haven't figured out whether to go with right or left
														// here
					tree.addLeft(newAnimal, current);
					vinput = true;
				} else {
					/*
					 * try again if invalid input
					 */
					System.out.println("Your response must be either Y or N");
				}
			}
		}


	}
}
