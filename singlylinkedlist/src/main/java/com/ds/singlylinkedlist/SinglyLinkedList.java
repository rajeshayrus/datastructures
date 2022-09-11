package com.ds.singlylinkedlist;

import java.awt.List;

public class SinglyLinkedList {

	ListNode head = null;

	public void addfrst(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			newNode.setNextNode(null);
			head = newNode;

		} else {
			newNode.setNextNode(head);
			head = newNode;
		}
	}

	public void add(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			newNode.setNextNode(null);
			head = newNode;

		} else {
			ListNode current = head;
			newNode.setNextNode(null);
			while (current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
		}
	}

	public void insertAt(int data, int position) {
		int currentPosition = 1;
		ListNode previuos = head;
		ListNode newNode = new ListNode(data);
		while (currentPosition < position - 1) {
			previuos = previuos.getNextNode();
			currentPosition++;
		}
		newNode.setNextNode(previuos.getNextNode());
		previuos.setNextNode(newNode);
	}

	public void deleteHead() {
		head = head.getNextNode();
	}

	public void deleteTail() {
		ListNode currentNode = head;
		ListNode prevousNode = null;
		while (currentNode.getNextNode() != null) {
			prevousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
		prevousNode.setNextNode(null);
		currentNode = null;
	}

	public boolean search(int key) {
		ListNode currentNode = head;
		while (currentNode != null) {
			if (currentNode.getData() == key)
				return true;
			currentNode = currentNode.getNextNode();
		}
		return false;
	}

	public ListNode getHead() {
		return head;

	}

	public static SinglyLinkedList reverseList(SinglyLinkedList sl) {
		/*
		 * ListNode currentNode = sl.head.getNextNode(); SinglyLinkedList rsl = new
		 * SinglyLinkedList(); ListNode head2 = sl.getHead(); head2.setNextNode(null);
		 * ListNode newNode = null; rsl.head = head2; System.out.println(currentNode);
		 * while (currentNode != null) { newNode = currentNode; ListNode temp =
		 * currentNode; currentNode = currentNode.getNextNode();
		 * newNode.setNextNode(rsl.head); rsl.head = temp; }
		 */
		
		ListNode current = sl.head;
		ListNode newList = sl.head;
		ListNode temp = null;
		current=current.getNextNode();
		newList.setNextNode(null);
		while(current!=null) {
			temp = current;
			current=current.getNextNode();
			temp.setNextNode(newList);
			newList=temp;
		}

		sl.head=newList;
		return sl;
	}

	public ListNode middleNode() {
		ListNode slowNode = head;
		ListNode fastNode = head;
		while (fastNode != null && fastNode.getNextNode().getNextNode() != null) {
			slowNode = slowNode.getNextNode();
			fastNode = fastNode.getNextNode().getNextNode();
		}
		return slowNode;
	}

	public ListNode getNthNodeFromEnd(int n) {
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while (count < n) {
			if (refPtr == null) {
				System.out.println((n + " is greater than length"));
			}
			refPtr = refPtr.getNextNode();
			count++;
		}
		while (refPtr != null) {
			mainPtr = mainPtr.getNextNode();
			refPtr = refPtr.getNextNode();
		}
		return mainPtr;
	}

	public void removeDuplicate() {
		ListNode currentNode = head;
		while (currentNode != null && currentNode.getNextNode() != null) {
			if (currentNode.getData() == currentNode.getNextNode().getData()) {
				currentNode.setNextNode(currentNode.getNextNode().getNextNode());
			} else {
				currentNode = currentNode.getNextNode();
			}
		}
	}

	public void insertNodeInSortedLinkedList(int data) {
		ListNode currentNode = head;
		ListNode temp = null;
		ListNode newNode = new ListNode(data);
		while (currentNode != null && currentNode.getData() < newNode.getData()) {
			temp = currentNode;
			currentNode = currentNode.getNextNode();
		}
		newNode.setNextNode(currentNode);
		temp.setNextNode(newNode);

	}

	public void deleteData(int key) {
		ListNode current = head;
		ListNode temp = null;
		while (current != null && current.getData() != key) {
			temp = current;
			current = current.getNextNode();
		}
		if (current == null)
			return;
		temp.setNextNode(current.getNextNode());
	}

	public boolean detectLoop() {
		ListNode slowNode = head;
		ListNode fastNode = head;
		while (fastNode != null && fastNode.getNextNode() != null) {
			if (slowNode == fastNode)
				return true;
			fastNode = fastNode.getNextNode().getNextNode();
			slowNode = slowNode.getNextNode();
		}
		return false;
	}

	public void merge(SinglyLinkedList a, SinglyLinkedList b) {
		ListNode current1 = a.head;
		ListNode current2 = b.head;
		ListNode temp1 = null;
		ListNode temp2 = null;
		while(current2!=null&&current1!=null&&current1.getNextNode()!=null) {
			if(current1.getNextNode().getData()>=current2.getData()) {
				temp1=current1.getNextNode();
				temp2=current2.getNextNode();
				current2.setNextNode(temp1);
				current1.setNextNode(current2);
				current2 = temp2;
				current1=current1.getNextNode();
				System.out.println(current1.getData());
			}
			else {
				current1 = current1.getNextNode();
			}
		}
		
	}
	public void print() {
		ListNode currentNode = head;
		if (head.getNextNode() == null)
			System.out.println(head.getData());
		while (null != currentNode.getNextNode()) {
			System.out.print(currentNode.getData() + " > ");
			currentNode = currentNode.getNextNode();
		}
		System.out.println(currentNode.getData());
	}
}
