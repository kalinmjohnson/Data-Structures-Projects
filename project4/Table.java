package project4;

import java.util.Random;

/**
 * Reviewing working with Arrays
 * 
 * @author gosnat/albing
 * @author Kalin Johnson
 * @version Fall 2021
 *
 */
public class Table {

	/** The actual 2D array of values */
	private int[][] values;

	/**
	 * Fill this in to determine whether this object is equivalent to the object
	 * being passed in as a paramter Rules: 1) If otherObject isn't even a Table
	 * object, not equal 2) If this Table and the other table have different
	 * dimensions, not equal 3) If this Table and the other Table have different
	 * values, not equal
	 */
	@Override
	public boolean equals(Object otherObject) {

		// Check to see that otherObject is a Table

		if (otherObject instanceof Table) {
			int i = values.length - 1;

			// Create a local variable of type Table and cast the method parameter Object as
			// a Table
			Table table2 = (Table) otherObject;

			// Check to see they have the same number of rows
			int j = table2.values.length - 1;
			if (j != i) {
				return false;
			}

			// Check to see if they have the same number of columns in each row
			int k;
			for (k = 0; k < i; k++) {
				if (values[k].length != table2.values[k].length) {
					return false;
				}
			} // end for loop

			// Check all the values in the two 2D arrays
			int x;
			int y;
			for (x = 0; x < i; x++) {
				for (y = 0; y < values[i].length; y++) {
					if (values[x][y] != table2.values[x][y]) {
						return false;
					}
				}
			} // end of for loop

			return true;
		} else {
			return false;
		}

	} // end equals

	/**
	 * @return the smallest value stored in this table
	 * @throws IllegalStateException if zero dimension(s)
	 */
	public int smallestValue() throws IllegalStateException {
		if (values.length == 0) {
			throw new IllegalStateException("The array has 0 rows, so it doesn't have any values stored in it.");
		} else {
			int i = values.length - 1;
			int j;
			boolean validlen = false;
			for (j = 0; j < i; j++) {
				if (values[j].length != 0) {
					validlen = true;
				}
			}
			if (validlen == false) {
				throw new IllegalStateException("The array has 0 columns, so it doesn't have any values stored in it.");
			}
		}
		int i = values.length - 1;
		int smallest = values[0][0];
		int j;
		for (j = 0; j < i; j++) {
			int k;
			for (k = 0; k < (values[j].length - 1); k++) {
				if (values[j][k] < smallest) {
					smallest = values[j][k];
				}
			}
		}

		return smallest;

	} // end smallest value

	/**
	 * Alter the value at the specified coordinates
	 * 
	 * @param number the new value to store at that location
	 * @param row    the row where you want to make the change
	 * @param col    the column where you want to make the change
	 * @throws IllegalArgumentException if coordinates are not a valid location
	 */
	public void setValueAt(int number, int row, int col) throws IllegalArgumentException {
		int i = (values.length - 1);
		int j = (values[0].length - 1);
		if (row >= i || col >= j || row < 0 || col < 0) {
			throw new IllegalArgumentException(
					"the location you entered is not a valid location.  Please enter a row less than " + i
							+ " or a column less than " + j);
		}
		values[row][col] = number;
	}// end set value at

	/**
	 * A constructor that populates array based on "random" number seed
	 * 
	 * @param rows the row count of the 2D array
	 * @param cols the column count of the 2D array
	 * @param seed the seed value for the psuedo-random number generator (ensures we
	 *             get the same set of values each time)
	 */
	public Table(int rows, int cols, int seed) {
		Random rGen = new Random(seed);
		values = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				values[r][c] = rGen.nextInt(101) - 50; // random value between -50 and 50
			}
		}
	}// end table constructor

	/**
	 * A second (overloaded) constructor where all values are manually supplied
	 * 
	 * @param data
	 */
	public Table(int[][] data) {
		values = data.clone(); // Should result in deep copy for Java primitive arrays
	}// end table constructor

} // class Table
