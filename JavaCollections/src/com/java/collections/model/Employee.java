/**
 * 
 */
package com.java.collections.model;

/**
 * @author tusharsaran
 * this is a model class
 * @param <T>
 */
public class Employee implements Comparable<Employee> {
	
	private String empname;
	private int age;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.age -  o.age;
	}
	
	
	
	

}
