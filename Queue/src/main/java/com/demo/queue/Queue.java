package com.demo.queue;

import java.util.NoSuchElementException;

public class Queue<T> {

	public ListNode rear;
	public ListNode front;
	public int length;
	
	private class ListNode{
		private Object data;
		private ListNode next;
		public ListNode(Object data) {
			// TODO Auto-generated constructor stub
			this.data=data;
		}
		public ListNode getNext() {
			return next;
		}
		public void setNext(ListNode next) {
			this.next = next;
		}
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	
	public void enqueue(Object data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}
		else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public Object dequeue() {
		if(isEmpty())
			throw new NoSuchElementException();
		ListNode result = new ListNode(front.data);
		front = front.next;
		length--;
		return result.data;
	}
	
	
	
	
	
	
}
