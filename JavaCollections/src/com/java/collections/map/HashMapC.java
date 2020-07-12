/**
 * 
 */
package com.java.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author tusharsaran
 *
 */
public class HashMapC {

	/**
	 * key/value pair
	 * no order main
	 * not sorted
	 * key does now take duplicate element , value can have
	 * key/value can take null values
	 * not synchronized
	 * similar to hashtable , only difference is it allows null values for both jey and value and is non synchronized or not thread safe.
	 */
	public static void main(String[] args) {
		Map<Long, String> employee = new HashMap<Long, String>();
		//inserting	 in map
		employee.put(1021l, "Aaru");
		employee.put(1022l, "Suruchi");
		employee.put(1023l, "Marukh");
		employee.put(1024l, "Zunni");	
		employee.put(1025l, "Verda");
		//employee.put(null, null);
		//employee.put(null, null);
		employee.put(1025l, null);
		
		//Iteration 1
		for(Map.Entry<Long, String> mp : employee.entrySet()) {
			System.out.printf("Key : %d \n",  mp.getKey());
			System.out.printf("Value  : %s \n",  mp.getValue());
			
		}
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::\n");
		
		//Iteration 2
		Set<Entry<Long, String>> set =  employee.entrySet();
		Iterator<Entry<Long, String>> itr  = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Long, String> mp1 = (Map.Entry<Long, String>) itr.next();
			System.out.printf("Key : %d \n", mp1.getKey())  ;
			System.out.printf("Value  : %s \n",  mp1.getValue());
		}
		
		//Iteration 3 getting keys 
		for(Long empid :  employee.keySet()) {
			System.out.printf("Key : %d \n", empid)  ;
		}
		
		//Iteration 3 getting values 
		for(String name :  employee.values()) {
			System.out.printf("Values : %s \n", name)  ;
		}
		
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.printf("Without Sorting ::::::::::::::::::::::::::::::\n");
		
		for(Map.Entry<Long, String> empWithoutSort :  employee.entrySet()){
			System.out.printf("Key  : %d\n", empWithoutSort.getKey());
			System.out.printf("Values  : %s\n", empWithoutSort.getValue());
		}
		
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.printf("With key as Sorting ::::::::::::::::::::::::::\n");
		
		//Sorting Keys in Hashmap
		Map<Long, String> treeMap =  new TreeMap<>();
		treeMap.putAll(employee);
		
		//get record based of key as Key is sorted
		for(Map.Entry<Long, String> empSorted :  treeMap.entrySet()) {
			System.out.printf("Key : %d ", empSorted.getKey());
			System.out.printf(" Value : %s\n", empSorted.getValue());
		}
		
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.printf("::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.printf("With Values as Sorting :::::::::::::::::::::::\n");
		
		List<String>  list = new LinkedList(employee.entrySet());
		
		Comparator<String> valueComp =  new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable)(((Map.Entry) o1).getValue())).compareTo((((Map.Entry) o2).getValue()));
			}
		};
		
		Collections.sort(list, valueComp);
		
	}
	

}
