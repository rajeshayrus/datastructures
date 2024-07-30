package com.demo.doublylinkedlist.main;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode{
		private int data;
		private ListNode next=null;
		private ListNode previous=null;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.length= 0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void addFirst(int data) {
		ListNode ln = new ListNode(data);
		if(isEmpty()) {
			tail=ln;
			length=1;
		}else {
			head.previous=ln;
			ln.next=head;
			System.out.println(length);
			length = length+1;
		}
		head=ln;
	}
	
	public void addLast(int data) {
		ListNode ln = new ListNode(data);
		if(isEmpty()) {
			head=ln;
			length=1;
		}
		else {
			tail.next=ln;
			ln.previous=tail;
			length = length++;
		}
		tail=ln;
	}
	
	public ListNode deleteFirstNode() {
		ListNode temp = null;
		if(isEmpty()) {
			return null;
		}
		if(head==tail)
			tail = null;
		else {
			temp = head;
			head.next.previous = null;
			head= head.next;
		}
		return temp;
	}
	
	public ListNode deleteLastNode() {
		ListNode temp = null;
		if(isEmpty()) {
			return null;
		}
		else {
			temp = tail;
			tail.previous.next=null;
			tail=tail.previous;
		}
		
		return temp;
	}
	public int length() {
		return length;
	}
	public void print() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+" > ");
			current = current.next;
		}
		System.out.println("null");
	}
}
