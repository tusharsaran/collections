/**
 * 
 */
package com.java.collections.list;

import com.java.collections.model.Node;

/**
 * @author tusharsaran
 *
 */
public class LinkedListC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
	}

}



class SinglyLinkedList<E>{
	
	Node<E> head;
	Node<E> tail;
	int size;
	
	//2 5
	public void add(E data) {
		Node<E> node = new Node<>(data);
		if(head == null && tail == null) {
			head =  node;
			
		}
		head.next = node;
		tail = node;
		size ++;
		
	}
	
	//3 2
	public void addFirst(E data) {
		Node<E> node = new Node<>(data);
		if(head == null && tail == null) {
			head =  node;
		}
		Node temp  = head;
		head = node;
		head.next = temp;
		size ++;
		
	}
	
	
	
}
