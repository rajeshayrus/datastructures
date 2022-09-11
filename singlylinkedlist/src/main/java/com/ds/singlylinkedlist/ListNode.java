package com.ds.singlylinkedlist;

public class ListNode {

	private int data;
	private ListNode nextNode;
	public ListNode(int data2) {

		data= data2;
		nextNode = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
	
}
