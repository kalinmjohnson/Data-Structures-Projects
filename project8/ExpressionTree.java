package project8;


import java.util.Scanner;


/**
 * A basic Expressions tree class
 * @author Nathan Gossett
 * @author Kalin Johnson
 * @version Spring 2021
 *
 */

public class ExpressionTree{
	
	/**
	 * Basic Binary Tree Node class. 
	 * @author Nathan Gossett
	 *
	 * @param <T>
	 */
	private class BTNode<T>{
		public T data;
		public BTNode<T> left;
		public BTNode<T> right;
		
		public BTNode(T data, BTNode<T> left, BTNode<T> right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
	}
	
	/** Root of tree.  If tree is not empty, will be equal to null */
	private BTNode<String> root;
	
	
	/**
	 * Construct a tree from the given expression
	 * @param expression: infix expression with parentheses around all sub expressions and spaces between all tokens
	 * @throws RuntimeException For malformed infix expressions
	 */
	public ExpressionTree(String expression) throws RuntimeException{
		Scanner in = new Scanner(expression);
		root = buildTree(in);
		if(in.hasNext()){
			throw new RuntimeException("Symbols encountered after end of expression: " + in.next());
		}
		
	}
	
	/**
	 * Build left and right sub-trees recursively, operator in parent node
	 * @param in A scanner that has been advanced to the appropriate point in the expression
	 * @return The root node of the current (sub) tree
	 * @throws RuntimeException for illegal expressions
	 */
	private BTNode<String> buildTree(Scanner in) throws RuntimeException{
		BTNode<String> root = new BTNode<String>(null, null, null);
		if (!in.hasNext()) {
			throw new RuntimeException("No expression found");
		}
		if (in.hasNextDouble()) {
			root.data = in.next();
			return root;
		}
		if (openParen(in)) {
			root.left = buildTree(in);
			if (closeParen(in)) {
				return root.left;
			}
			if (!in.hasNext() ) {
				throw new RuntimeException("Missing close paren");
			}
			root.data = in.next();
			if (!isValidOperator(root.data)) {
				throw new RuntimeException("Invalid operator: " + root.data);
			}
			root.right = buildTree(in);
			if (!closeParen(in)) {
				throw new RuntimeException("Closing paren not found");
			}
			
			return root;
		}
		throw new RuntimeException("Malformed expression: " + in.next());
	}
	
	/**
	 * Detect and consume (if present) a closing parenthesis from the input expression
	 * @param in A scanner that has been parsed to the appropriate point in the exception
	 * @return true if the closing paren was detected and consumed, false otherwise
	 */
	private boolean closeParen(Scanner in) {
		if(in.hasNext("\\)"))
		{
			in.next();
			return true;
		}
		return false;
	}
	
	/**
	 * Detect and consume (if present) an opening parenthesis from the input expression
	 * @param in A scanner that has been parsed to the appropriate point in the exception
	 * @return true if the opening paren was detected and consumed, false otherwise
	 */
	private boolean openParen(Scanner in) {
		if(in.hasNext("\\("))
		{
			in.next();
			return true;
		}
		return false;
	}
	
	/**
	 * Check to see if symbol contains +, -, *, or /
	 * @param symbol 
	 * @return true if symbol is one of the four allowed operators, false otherwise
	 */
	private boolean isValidOperator(String symbol){
		boolean valid = false;
		if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
			valid = true;
		}
		return valid;
	}
	


	public static void main(String[] args){
		ExpressionTree et = new ExpressionTree("( ( ( 15 / 5 ) - 9 ) + ( ( 7 * 4 ) + ( 8 * 2 ) ) )");
		//System.out.println(et + "= " + et.evaluateTree());
		System.out.println(et.printPostFix(et.root));
		System.out.println(et.printInFix(et.root));
	}

	
	/** 
	 * HOMEWORK - Done
	 * Infix = in-order traversal
	 * @return String representation of tree
	 */
	public String printInFix() {
	    return printInFix(root);
	}

	public String printInFix(BTNode<String> et) {
	    if (et.left == null) {return et.data; }
	    return "( " + printInFix(et.left) + " " + et.data + " " + printInFix(et.right) + " )";
	}
	
	/** 
	 * HOMEWORK
	 * @return PostFix representation of tree
	 */
	public String printPostFix() {
		return printPostFix(root);
	}

	public String printPostFix(BTNode<String> et) {
	    if (et.left == null) {return et.data; }
	    return printPostFix(et.left) + " " + printPostFix(et.right) + " " + et.data;
	}
	
	
	
	/**
	 * HOMEWORK
	 * @return value that this tree evaluates to
	 */
	public double evaluateTree(){
		//TODO
		return evaluateTree(root);
	}
	
	private double evaluateTree(BTNode<String> current) {
		if (current.left == null) {
			double number = Integer.parseInt(current.data);
			return number;
		}
		return applyOperator(current.data, evaluateTree(current.left), evaluateTree(current.right));
	}
	

	/**
	 * HOMEWORK
	 * @param operator 
	 * @param left left operand
	 * @param right right operand
	 * @return result of applying operator to left and right operands
	 * @throws RuntimeException for anything other than +, -, *, /
	 */
	private double applyOperator(String operator, double left, double right)
			throws RuntimeException {
		//TODO
		if (operator.equals("+")) {
			return left + right;
		} else if (operator.equals("-")) {
			return left - right;
		} else if (operator.equals("*")) {
			return left * right;
		} else if (operator.equals("/")) {
			return left / right;
		} else {
			throw new RuntimeException("The operator must be +, -, *, or /. The operator was " + operator);
		}
	}
}
