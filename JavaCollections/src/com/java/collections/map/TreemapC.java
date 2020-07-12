/**
 * 
 */
package com.java.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author tusharsaran
 * - key/value pair
 * - no order
 * - does now allow duplicate values but not keys, if keys are duplicate it will overide the last value
 * - sorted - key wise
 * - non synchronized
 * - no null values in key allow null in values
 *
 */
public class TreemapC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> empMap =  new TreeMap<>();
		
		empMap.put(4,  "testingDuplicate");
		empMap.put(4,  "Marukh");
		empMap.put(3,  "Marukh");
		empMap.put(1,  "Aaru");
		empMap.put(2,  "Suruchi");
		empMap.put(3,  "test");
		empMap.put(5,  "test");
		empMap.put(6,  null);
		
		
		for(Map.Entry<Integer, String> emp : empMap.entrySet()) {
			System.out.printf("key :::::::::: %d\n" , emp.getKey());
			System.out.printf("Value :::::::::: %s\n" , emp.getValue());
			}
		
		for(Integer empId:  empMap.keySet()) {
			System.out.printf("key :::::::::: %d\n" ,empId);
		}
		
		for(String empName:  empMap.values()) {
			System.out.printf("key :::::::::: %s\n" ,empName);
		}
		
		System.out.printf("Do we have this key : %b\n",empMap.containsKey(2));
		System.out.printf("Do we have this value : %b\n",empMap.containsValue("testing"));
		
		System.out.printf("removing key : %s\n",empMap.remove(3));
		
		for(Map.Entry<Integer, String> emp : empMap.entrySet()) {
			System.out.printf("key :::::::::: %d\n" , emp.getKey());
			System.out.printf("Value :::::::::: %s\n" , emp.getValue());
			}
		
	}
	
	
		

}
