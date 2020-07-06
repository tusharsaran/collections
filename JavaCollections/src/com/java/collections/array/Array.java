/**
 * 
 */
package com.java.collections.array;

/**
 * @author tusharsaran
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create an array
		int[] oneDArray = new int[7];
		int count = 0;

		// insert elements in array
		for (int i = 0; i < oneDArray.length; i++) {
			count = count + 2;
			oneDArray[i] = count;
		}

		// traversing an in array
		for (int i = 0; i < oneDArray.length; i++) {
			System.out.printf("%d\n", oneDArray[i]);
		}

		// searching element in array
		for (int i = 0; i < oneDArray.length; i++) {
			if (oneDArray[i] == 12)
				System.out.printf("Searching element no  is : %d\n", oneDArray[i]);
		}

		// searching element in array
		for (int i = 0; i < oneDArray.length; i++) {
			if (oneDArray[i] == 4)
				System.out.printf("Searching element found in the cell no :  %d\n ", i);
		}

		// deleting array
		oneDArray = null;

		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n");
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n");
		
		// create array in simple way
		int[] oneDimArray = { 3, 5, 6, 432, 64, 7, 46 };

		// traversing an in array
		for (int i = 0; i < oneDimArray.length; i++) {
			System.out.printf("%d\n", oneDimArray[i]);
		}

		// searching element in array
		for (int i = 0; i < oneDimArray.length; i++) {
			if (oneDimArray[i] == 432)
				System.out.printf("Searching element no  is : %d\n", oneDimArray[i]);
		}

		// searching element in array
		for (int i = 0; i < oneDimArray.length; i++) {
			if (oneDimArray[i] == 6)
				System.out.printf("Searching element found in the cell no :  %d\n", i);
		}
		
		// deleting array
		oneDimArray = null;


	}

}
