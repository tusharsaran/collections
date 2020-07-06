/**
 * 
 */
package com.java.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import com.java.collections.model.Employee;

/**
 * @author tusharsaran
 *
 */
public class VectorC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> vec = new Vector<>();
		
		Employee emp = new Employee();
		emp.setEmpname("Aaru");
		emp.setAge(2);
		vec.add(emp);
		Employee emp1 = new Employee();
		emp1.setEmpname("Suruchi");
		emp1.setAge(32);
		vec.add(emp1);
		Employee emp2 = new Employee();
		emp2.setEmpname("Zebra");
		emp2.setAge(21);
		vec.add(emp2);
		Employee emp3 = new Employee();
		emp3.setEmpname("Apple");
		emp3.setAge(53);
		vec.add(emp3);
		Employee emp4 = new Employee();
		emp4.setEmpname("Orange");
		emp4.setAge(23);
		vec.add(emp4);
		Employee emp5 = new Employee();
		emp5.setEmpname("Boy");
		emp5.setAge(54);
		vec.add(emp5);
		
		for(Employee empDetails : vec) {
			System.out.printf("Employee name is : %s \nEmployee age is : %d \n", empDetails.getEmpname(), empDetails.getAge());
		}
		
		System.out.printf("Vector size is : %d \n", vec.size());
		Collections.sort(vec);
		
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("After sorting age wise");
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("\n");
		
		
		for(Employee empDetails : vec) {
			System.out.printf("Employee name is : %s \nEmployee age is : %d \n", empDetails.getEmpname(), empDetails.getAge());
		}
		
		Comparator<Employee> comp = new Comparator<>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpname().compareTo(e2.getEmpname());
			}
			
		};
		Collections.sort(vec, comp);
		
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("After sorting name wise");
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("\n");
		
		for(Employee empDetails : vec) {
			System.out.printf("Employee name is : %s \nEmployee age is : %d \n", empDetails.getEmpname(), empDetails.getAge());
		}
		
		
		Collections.sort(vec, Collections.reverseOrder());
		
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("After sorting age wise in reverse order");
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("\n");
		
		for(Employee empDetails : vec) {
			System.out.printf("Employee name is : %s \nEmployee age is : %d \n", empDetails.getEmpname(), empDetails.getAge());
		}
		
		Comparator<Employee> comp1 = new Comparator<>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				return e2.getEmpname().compareTo(e1.getEmpname());
			}
			
		};
		
		Collections.sort(vec, comp1);
		
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("After sorting name  wise in reverse order");
		System.out.printf(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("\n");
		
		
		for(Employee empDetails : vec) {
			System.out.printf("Employee name is : %s \n Employee age is : %d \n", empDetails.getEmpname(), empDetails.getAge());
		}
		
		
	}
	
	

}
