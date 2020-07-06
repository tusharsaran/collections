/**
 * 
 */
package com.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.java.collections.model.Employee;

/**
 * @author tusharsaran
 *
 */
public class Arraylist<E> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> arrayList =  new ArrayList<>();
		//arrayList = create(arrayList);
		initialize(arrayList);
		traverse(arrayList);
		findLength(arrayList);
		sortAndTraverse(arrayList);
		sortAndTraverseInRverse(arrayList);
		sortViaComparatorAndTraverse(arrayList);
		addElementInIndex(arrayList);
		addFromOneListToAnother(arrayList);
		addFromOneListToAnotherIndex(arrayList);
		removeElement(arrayList);
		getElementList(arrayList);
		getElementIndex(arrayList);
		getElementLastIndex(arrayList);
		containsElement(arrayList);
		createSublist(arrayList);
		convertingArrayToArrayList();
		addObject();
	}
	
	//create arraylist
	public  List<E>  create(List<E> arrayList) {
		List<E> arrayList1 =  new ArrayList<>(); 
		return arrayList1;
	}
	
	//initialize arraylist
	public static void initialize(List<Integer> arrayList) {
		arrayList.add(23);
		arrayList.add(32);
		arrayList.add(4);
		arrayList.add(12);
		arrayList.add(6);
		arrayList.add(23);
		arrayList.add(4);
	}
	
	//traverse arraylist
	public static void traverse(List<Integer> arrayList) {
		for(Integer num : arrayList) {
			System.out.printf("numbers are : %d \n", num);
		}
	}

	//length of  arraylist
	public static void findLength(List<Integer> arrayList) {
		System.out.printf("length of arraylist is : %d \n", arrayList.size());
	}
	
	//Sorting arraylist and traverse
	public static void sortAndTraverse(List<Integer> arrayList) {
		Collections.sort(arrayList);
		for(Integer num : arrayList) {
			System.out.printf("length of arraylist is : %d \n", num);
		}
	}		
	
	//Sorting arraylist in reverse order and traverse
		public static void sortAndTraverseInRverse(List<Integer> arrayList) {
			Collections.sort(arrayList, Collections.reverseOrder());
			for(Integer num : arrayList) {
				System.out.printf("length of arraylist is : %d \n", num);
			}
		}		
		
	
	//Sorting arraylist via comparator and traverse
		public static void sortViaComparatorAndTraverse(List<Integer> arrayList) {
			//Sorting arraylist via comparator and traverse
			Comparator<Integer> cmp = new Comparator<>(){
				
				@Override
				public int compare(Integer num1, Integer num2) {
					return num1 < num2  ? 1 : -1;
				}
			};
			
			Collections.sort(arrayList, cmp);
			for(Integer num : arrayList) {
				System.out.printf("length of arraylist is : %d \n", num);
			}
		}
		
	//adding element in a particular index
		public static void addElementInIndex(List<Integer> arrayList) {
			arrayList.add(3, 924);
		}
		
		//adding element sfrom one List to another list
		public static void addFromOneListToAnother(List<Integer> arrayList) {
			List<Integer> output =  new ArrayList<>();
			output.addAll(arrayList);
			for(Integer outputNum : output) {
				System.out.printf("getting element from output list  : %d \n", outputNum);
			}
		}	
		
		//adding element sfrom one List to another list
		public static void addFromOneListToAnotherIndex(List<Integer> arrayList) {
			List<Integer> output =  new ArrayList<>();
			output.add(21);
			output.add(42);
			output.addAll(2,arrayList);
			for(Integer outputNum : output) {
				System.out.printf("getting element from output list  : %d \n", outputNum);
			}
		}
		
		
		//removing element from a particular index
			public static void removeElement(List<Integer> arrayList) {
				arrayList.remove(3);
			}
			
			//removing element from list
			public static void removeElementList(List<Integer> arrayList) {
				//arrayList.remove(Integer);
			}
			
			//get element from list
			public static void getElementList(List<Integer> arrayList) {
				System.out.printf("getting element from  list  : %d \n", arrayList.get(2));
				;
			}
			
			//get index of element
			public static void getElementIndex(List<Integer> arrayList) {
				System.out.printf("getting element index  : %d \n", arrayList.indexOf(12));
			}
			
			//get index of element
			public static void getElementLastIndex(List<Integer> arrayList) {
				System.out.printf("getting element index  : %d \n", arrayList.lastIndexOf(23));
			}
			
			//if element part of list
			public static void containsElement(List<Integer> arrayList) {
				System.out.printf("if list contains 4  : %b \n", arrayList.contains(4));
			}
			
			//creating sublist from list
			public static void createSublist(List<Integer> arrayList) {
				List<Integer>sublist = arrayList.subList(2, 5);
				for(Integer outputNum : sublist) {
					System.out.printf("sublist value  : %d \n", outputNum);
				}
			}
			
			//array to arraylist
			public static void convertingArrayToArrayList() {
				int[] sampleArray = new int[3];
				sampleArray[0] = 2;
				sampleArray[1] = 5;
				sampleArray[2] = 1;
				
				List<Integer>arraylist = IntStream.of(sampleArray).boxed().collect(Collectors.toCollection(ArrayList :: new));
				for(Integer outputNum : arraylist) {
					System.out.printf("arraylist value  : %d \n", outputNum);
				}
				
				Integer[] sampleArray1 = new Integer[2];
				sampleArray1[0] = 11;
				sampleArray1[1] = 4;
				List<Integer> output  = Arrays.asList(sampleArray1);
				for(Integer outputNum : output) {
					System.out.printf("arraylist value  : %d \n", outputNum);
				}
			}
			
			//adding Object/model to arraylist
			public static void addObject() { 
				List<Employee> empList = new ArrayList<>();
				Employee emp = new Employee();
				emp.setEmpname("Aaru");
				emp.setAge(2);
				empList.add(emp);
				Employee emp1 = new Employee();
				emp1.setEmpname("Suruchi");
				emp1.setAge(32);
				empList.add(emp1);
				for(Employee empDetails : empList) {
					System.out.printf("Employee name is : %s \nEmployee age is : %d \n", empDetails.getEmpname(), empDetails.getAge());
				}
				
				
			}
			
}	
