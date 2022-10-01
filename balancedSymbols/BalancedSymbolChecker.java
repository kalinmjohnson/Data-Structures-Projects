
package balancedSymbols;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.EmptyStackException;

/**
 * Project 6
 * 
 * 
 * @author Nathan Gossett
 * @author Kalin Johnson
 * @version Spring 2022
 *
 */
public class BalancedSymbolChecker<T> {

	// Remember to add Javadocs

	/**
	 * Variable Information text = String of text containing the code we're parsing
	 * input = array of all the characters stack = array of characters to keep track
	 * of (, [, and { size = size of the stack array
	 */

	private String text;
	private char[] input;
	private char[] stack = new char[100];
	private int size = 0;

	/**
	 * The main method that checks the balance
	 * 
	 * @param the name of the file that is being checked
	 * @return void
	 * 
	 */
	public BalancedSymbolChecker(String filename) {

		/*
		 * Variables cont = whether to continue or not text = original string of text
		 */
		boolean cont = true;
		text = "";

		/*
		 * try and catch block
		 */
		try {
			BufferedReader bir = new BufferedReader(new FileReader(filename));
			while (bir.ready()) {
				text += bir.readLine() + "\n";
			}

			input = ParseText(text);
			int j = input.length;
			for (int i = 0; i < j && cont == true; i++) {
				i = CheckSingleLineComments(i, input);
				if (CheckQuotesAndBlockComments(i, input)) {
					if (MainCheck(input[i])) {
						if (OpenOrClosed(input[i])) {
							cont = CheckIfEqual(input[i]);
						}
					}
				}
				if (cont == true) {
					PrintText(input[i]);
				}
			}
			if (cont == true) {
				NullCheck();
			}

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + filename);
		} catch (IOException e) {
			System.err.println("Error reading from file: " + e.getMessage());
		}

	}

	/**
	 * Checks to see if stack is empty
	 * 
	 * @param no parameters
	 * @return whether the stack is empty or not
	 */
	public boolean isEmpty() {
		return (size == 0);
	}// isEmpty

	/**
	 * @param no parameters
	 * @return the top character on the stack
	 * 
	 */
	public char top() {
		if (size == 0) {
			return '0';
		}
		return stack[size - 1];
	}
	
	/**
	 * @param a character
	 * @return the stack when the input character is added to the top of the stack
	 * @throws an exception when the stack overflows
	 */

	public void push(char input) throws RuntimeException {
		if (size == stack.length) {
			throw new RuntimeException("Stack Overflow");
		}
		stack[size++] = input;
	}
	
	/**
	 * @param no parameters
	 * @return the stack when the top element has been removed
	 * @throws an exception when the stack is empty
	 */

	public char pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[--size];
	}
	
	/**
	 * @param a string of text from the file
	 * @return an array of characters made from the text
	 */

	private char[] ParseText(String text) {
		return text.toCharArray();
	}
	
	/**
	 * @param the current index and the array of characters that is being examined
	 * @return the current index or the index after the single line comment
	 */

	private int CheckSingleLineComments(int i, char[] input) {
		if (input[i] == '/' && input[i + 1] == '/') {
			while (input[i] != '\n' || i < size) {
				PrintText(input[i]);
				i++;
			}
		}
		return i;
	}
	
	/**
	 * @param the current index and the array of characters that is being examined
	 * @return false if the character is in a String or comment or is starting a string or a comment, true in any other situation
	 */

	private boolean CheckQuotesAndBlockComments(int i, char[] input) {
		boolean rettype;
		if (top() == '"') {
			if (input[i] == '"' && input[i - 1] != '\\') {
				pop();
			}
			rettype = false;
		} else if (top() == '/') {
			if (input[i] == '*' && input[i - 1] != '/') {
				if (input[i] == '*' && input[i + 1] == '/') {
					pop();
				}
			}
			rettype = false;
		} else if (input[i] == '"') {
			push(input[i]);
			rettype = false;
		} else if (input[i] == '/' && input[i + 1] == '*') {
			push(input[i]);
			rettype = false;
		} else {
			rettype = true;
		}
		return rettype;
	}
	
	/**
	 * @param the current character being examined
	 * @return true if it is one of specific characters that requires further tests, false in any other case
	 */

	private boolean MainCheck(char input) {
		if (input == '(' || input == ')' || input == '}' || input == '{' || input == '[' || input == ']') {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @param the current character being examined
	 * @return false if the character is an open bracket, true if it is a closed bracket
	 */

	private boolean OpenOrClosed(char input) {
		if (input == '(' || input == '{' || input == '[') {
			push(input);
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * @param the current character being examined
	 * @return true if closed bracket equals the most recent open bracket, false if there is an error
	 */

	private boolean CheckIfEqual(char input) {
		char topOfStack = top();
		boolean equal = false;
		if (topOfStack == '(') {
			if (input == ')') {
				equal = true;
			}
		} else if (topOfStack == '{') {
			if (input == '}') {
				equal = true;
			}
		} else if (topOfStack == '[') {
			if (input == ']') {
				equal = true;
			}
		}
		if (equal == false) {
			PrintText(input);
			if (topOfStack == '0') {
				System.out.println();
				System.out.println("ERROR: Missing opening bracket to " + input);
			} else {
				System.out.println();
				System.out.println("ERROR: cannot use " + input + " to close " + topOfStack);
			}
			return false;
		} else {
			pop();
			return true;
		}
	}

	/**
	 * @param the current character being examined
	 * @return void
	 */
	
	private void PrintText(char input) {
		System.out.print(input);
	}
	
	/**
	 * @param nothing
	 * @return false, but checks whether there is anything left in the stack array, which would be unbalanced
	 */

	private void NullCheck() {
		if (isEmpty()) {
			System.out.println("!!!!!!!!!! Balanced !!!!!!!!!!!!!!!!");
		} else {
			if (top() == '/') {
				System.out.println("ERROR: Missing closing */");
			} else {
				System.out.println("ERROR: Missing closing to " + top());
			}
		}
	}
	

	public static void main(String[] args) {
		new BalancedSymbolChecker("ValidClass.java");
	}

}
