/**
 * 
 */
package com.java.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author tusharsaran
 * 		- ordered in the way elements are inserted, maintains the insertion order
 * 		- no duplicates 
 * 		- allows the null element 
 * 		- non - synchronized 
 * 		- iterator returned by this class is fail-fast which means iterator would throw
 *         ConcurrentModificationException if HashSet has been modified after
 *         creation of iterator, by any means except iterator’s own remove
 *         method.
 */
public class LinkedHashSetC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<String> lhSet = new LinkedHashSet<String>();
		  lhSet.add("Mango");
		  lhSet.add("Apple");
		  lhSet.add("Orange");
		  lhSet.add("grapes");
		  lhSet.add("null");
		  lhSet.add("Banana");
		  lhSet.add("grapes");
	      System.out.printf("here is the value of lhSet %s \n", lhSet);
	      
	      Iterator<String> itr = lhSet.iterator();
	      while(itr.hasNext()) {
	    	  String fruit =  itr.next();
	    	  System.out.printf("Fruit name is  %s \n", fruit);
	      }
	      
	      System.out.printf("testing fail fast:::::::::::::");
	      Iterator<String> itr1 = lhSet.iterator();
	      while(itr1.hasNext()) {
	    	  String fruitName =  itr1.next();
	    	  //lhSet.add("Cherry");// will throw java.util.ConcurrentModificationException as the iterator is fail-fast
	    	  System.out.printf("Fruit name is  %s \n", fruitName);
	      }

	}

}
