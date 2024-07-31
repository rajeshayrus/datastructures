package com.demo.stack;

import java.util.EmptyStackException;

public class Stack {

	private ListNode top=null;
	private int length=0;
	
	private class ListNode<T>{
		private Object data;
		ListNode next;
		
		public ListNode(Object data) {
			this.data = data;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	public void push(Object data) {
		ListNode temp = new ListNode(data);
		temp.next=top;
		top = temp;
		length++;
	}
	
	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Object result = top.data;
		top=top.next;
		length--;
		return result;
	}
	
	public Object peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return top.data;
	}
}
