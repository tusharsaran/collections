/**
 * 
 */
package com.java.collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author tusharsaran
 *	Features : 
 * 		- sorting in asc ordering
 * 		- no duplicates 
 * 		- does not allows null element  as it uses compareTo() or compare method for sorting and if you try to compare any object with 
 * 		  null will throw NPE 
 * 		- non - synchronized 
 * 		- iterator returned by this class is fail-fast which means iterator would throw
 *         ConcurrentModificationException if HashSet has been modified after
 *         creation of iterator, by any means except iterator’s own remove
 *         method.
 */
public class TreeSetC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>();
		 treeSet.add("Mango");
	      treeSet.add("Apple");
	      treeSet.add("Orange");
	      treeSet.add("grapes");
	      treeSet.add("Banana");
	      treeSet.add("grapes");
	      
	      System.out.printf("here is the value of treeset %s \n", treeSet);
	      
	      Iterator<String> itr = treeSet.iterator();
	      while(itr.hasNext()) {
	    	  String fruit =  itr.next();
	    	  System.out.printf("Fruit name is  %s \n", fruit);
	      }
	      
	      System.out.printf("testing fail fast:::::::::::::");
	      Iterator<String> itr1 = treeSet.iterator();
	      while(itr1.hasNext()) {
	    	  String fruitName =  itr1.next();
	    	  //treeSet.add("Cherry");// will throw java.util.ConcurrentModificationException as the iterator is fail-fast
	    	  System.out.printf("Fruit name is  %s \n", fruitName);
	      }


	}

}
