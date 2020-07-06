/**
 * 
 */
package com.java.collections.array;

/**
 * @author tusharsaran
 *
 */
public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create two d array
		//first [] represents row and the second[] represents column 
		// so if it  int[2][1] that means 2 rows and one column  
			// => [0][0] =  2; 
			// 	  [1][0] = 4;
		int[][] twoDArray =  new int[4][3];
		
		//inserting element in 2 d array
		twoDArray[0][0] = 23;
		twoDArray[0][1] = 2;
		twoDArray[0][2] = 43;

		twoDArray[1][0] = 6;
		twoDArray[1][1] = 75;
		twoDArray[1][2] = 4;
		
		twoDArray[2][0] = 790;
		twoDArray[2][1] = 42;
		twoDArray[2][2] = 421;
		
		twoDArray[3][0] = 29;
		twoDArray[3][1] = 93;
		twoDArray[3][2] = 64;
		
		//traversing 2d array
		for(int i = 0; i < twoDArray.length; i ++) { //loop for rows
			for(int j = 0; j < twoDArray[0].length; j ++) { //for columns use twoDArray[0].length to get the column length
				System.out.printf("2D Array elements are %d\n", twoDArray[i][j]);
			}
		}
		
		//searching element in 2d array and print the element
		for(int i = 0; i < twoDArray.length; i ++) { //loop for rows
			for(int j = 0; j < twoDArray[0].length; j ++) { //for columns
				if(twoDArray[i][j] == 790)
					System.out.printf("Search value is %d\n", twoDArray[i][j]);
			}
		}
		
		//searching element in 2d array and print the cell number
		for(int i = 0; i < twoDArray.length; i ++) { //loop for rows
			for(int j = 0; j < twoDArray[0].length; j ++) { //for columns
				if(twoDArray[i][j] == 42)
					System.out.printf("Search value  row no is : %d and the column no  is  : %d\n", i, j	);
			}
		}
		//deleting 2d array
		twoDArray = null;	
	}

}
