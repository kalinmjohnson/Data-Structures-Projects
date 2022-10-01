package project7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Project 7
 * 
 * 
 * @author Kalin Johnson
 * @version Spring 2022
 *
 */

public class BinaryTree<T> {
	BTNode<T> root;

	/*
	 * Constuctors
	 * no param or return
	 */
	public BinaryTree() {
		root = new BTNode<T>("owl", null, null);
	}

	public BinaryTree(String rootdata, BinaryTree<T> leftT, BinaryTree<T> rightT) {
		root = new BTNode<T>(rootdata, null, null);
		if (leftT != null)
			root.left = leftT.root;
		if (rightT != null)
			root.right = rightT.root;
	}
	
	/**
	 * find Root
	 * @param no parameters
	 * @return the root of the tree
	 */

	public BTNode<T> findRoot() {
		return root;
	}
	
	/**
	 * Add Right
	 * @param data and the current node
	 * @return no return
	 */

	public void addRight(String data, BTNode<T> current) {
		BTNode<T> newNode = new BTNode<T>(data, null, null);
		current.right = newNode;
	}

	/**
	 * Add Left
	 * @param data and the current node
	 * @return no return
	 */
	
	public void addLeft(String data, BTNode<T> current) {
		BTNode<T> newNode = new BTNode<T>(data, null, null);
		current.left = newNode;
	}
	
	/**
	 * Next Right
	 * @param current node
	 * @return the node to the right of the current node
	 */

	public BTNode<T> nextRight(BTNode<T> current) {
		return current.right;
	}
	
	/**
	 * Next Left
	 * @param current node
	 * @return the node to the left of the current node
	 */

	public BTNode<T> nextLeft(BTNode<T> current) {
		return current.left;
	}
	
	/**
	 *BTNode Class
	 * Attributes: data, left pointer, and right pointer
	 */
	

	protected static class BTNode<T> {
		public String data;
		public BTNode<T> left;
		public BTNode<T> right;

		public BTNode(String data, BTNode<T> left, BTNode<T> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
}
