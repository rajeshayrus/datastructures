package com.demo.binaryheap;

/**
 * @author rajesh
 *Used to generate priority queue
 */
/**
 * @author rajesh
 *
 */
/**
 * @author rajesh
 *
 */
public class MaxBinaryHeap {

	Integer[] heap;
	int n;
	public MaxBinaryHeap(int capacity) {
		heap = new Integer[capacity+1];
		n = 0;
	}
	public boolean isEmpty() {
		return n==0;
	}
	
	public int size() {
		return n;
	}
	
	public static void main(String[] args) {
		MaxBinaryHeap maxHeap = new MaxBinaryHeap(3);
	}
	
	public void insert(int x) {
		if(n==heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]= x;
		swim(n);
	}
	
	
	
	private void resize(int capacity) {
		// TODO Auto-generated method stub
		Integer[] temp = new Integer[capacity];
		for(int i = 0; i< heap.length;i++) {
			temp[i]= heap[i];
		}
		
		heap = temp;
	}
	public void swim(int k) {
		
		while(k>1&&heap[k/2]<heap[k]) {
			int temp = heap[k];
			heap[k]=heap[k/2];
			heap[k/2] = temp;
			k = k/2;
		}
	}
}
