/**
 * 
 */
package com.java.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.java.collections.model.Employee;

/**
 * @author tusharsaran 
 * Features : 
 * 		- no order (only sort integer as it internally user Hashmap and hashmap stores its elements in hashtable and uses hashing 
 * 					therefore hashing will generate an int number.
 * 		- no duplicates 
 * 		- allows the null element 
 * 		- non - synchronized 
 * 		- Hashset provide better performance (faster) than TreeSet for the operations like add, remove, contains, size etc. 
 * 		  HashSet offers constant time cost while TreeSet offers log(n) time cost for such operations.
 * 		- iterator returned by this class is fail-fast which means iterator would throw
 *         ConcurrentModificationException if HashSet has been modified after
 *         creation of iterator, by any means except iterator’s own remove
 *         method.
 * 
 *
 */
public class HashSetC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Employee> setE = new HashSet<>();
		// setE.add(null);
		Employee emp = new Employee();
		emp.setEmpname("Aaru");
		emp.setAge(2);
		setE.add(emp);
		Employee emp1 = new Employee();
		emp1.setEmpname("Suruchi");
		emp1.setAge(32);
		setE.add(emp1);
		Employee emp2 = new Employee();
		emp2.setEmpname("Suruchi");
		emp2.setAge(32);
		setE.add(emp2);
		Employee emp3 = new Employee();
		emp3.setEmpname("Namit");
		emp3.setAge(32);
		setE.add(emp3);

		for (Employee empDet : setE) {
			System.out.printf("Employee name is : %s \nEmployee age is : %d \n", empDet.getEmpname(), empDet.getAge());
		}

		Set<Integer> setInt = new HashSet<>();
		setInt.add(2);
		setInt.add(94);
		setInt.add(3);
		setInt.add(2);
		setInt.add(null);
		setInt.add(1);
		setInt.add(null);
		setInt.add(null);
		setInt.add(null);

		System.out.println(setInt);
		for (Integer num : setInt) {
			System.out.printf("Numbers are : %d \n", num);
		}
		
		Set<String> hSet = new HashSet<String>();
			hSet.add("Apple");
			hSet.add("Mango");
			hSet.add("Orange");
			hSet.add("grapes");
			hSet.add("Banana");
			System.out.println(hSet);

		Iterator<Employee> itr = setE.iterator();
		while (itr.hasNext()) {
			Employee empDetails = itr.next();
			if (empDetails.getAge() == 2) {
				// setE.clear(); ---------------- this line will throw Exception in thread
				// "main" java.util.ConcurrentModificationException
				// as the iterator is fail fast
			}
			System.out.printf("Employee name is : %s \nEmployee age is : %d \n", empDetails.getEmpname(),
					empDetails.getAge());
		}

		int[] arr = new int[setInt.size()-1];
		int count = 0;
		
		for (Integer num : setInt) {
			if (num != null) {
				arr[count] = num;
				count++;
			}
		}

		System.out.printf("Testing array :::::::::::::::::::::::\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("array  element value is ::::::::::::::::::::::: %d\n", arr[i]);
		}
		
		List<Integer> arrayList =  new ArrayList<>();
		arrayList.addAll(setInt);

		System.out.printf("Testing arraylist :::::::::::::::::::::::\n");
		for (Integer num1 : arrayList) {
			System.out.printf("array  list element value is ::::::::::::::::::::::: %d\n", num1);
			}
		
		
		
		Set<Integer> treeSet =  new TreeSet<>();
		//treeSet.addAll(setInt);  throw NPE as Treeset does not allow null values

		//therefore adding another hashset
		Set<Integer> setAnotherInt = new HashSet<>();
		setAnotherInt.add(2);
		setAnotherInt.add(1);
		setAnotherInt.add(94);
		setAnotherInt.add(3);
		setAnotherInt.add(2);
		setAnotherInt.add(1);
		treeSet.addAll(setAnotherInt);
		
		System.out.printf("Testing treeSet :::::::::::::::::::::::\n");
		for (Integer treeSetNum : treeSet) {
			System.out.printf("array  list element value is ::::::::::::::::::::::: %d\n", treeSetNum);
		}
		
		
		setE.clear();

	}

}
