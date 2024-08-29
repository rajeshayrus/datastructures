package com.demo.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	public TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private Object data;
		
		public TreeNode(Object data) {
			super();
			this.data = data;
		}
		public TreeNode getLeft() {
			return left;
		}
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		public TreeNode getRight() {
			return right;
		}
		public void setRight(TreeNode right) {
			this.right = right;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void preOrderRecursive(TreeNode root) {
		
		if(root==null)
			return;
		System.out.println(root.data+"  ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
	}
	
	public void preOrderIterative() {
		if(root==null)
			return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.println(temp.data);
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			if(temp.left!=null) {
				stack.push(temp.left);
			}
		}
	}
	
	public void inOrderRecursive(TreeNode root) {
		if(root==null)
			return;
		
		inOrderRecursive(root.left);
		
		System.out.println(root.data+"  ");
		
		inOrderRecursive(root.right);
		
	}

	public void InOrderIterative() {
		if(root==null)
			return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = root;
		while(!stack.isEmpty()||temp!=null) {
			
			if(temp!=null) {
				stack.push(temp);
				temp=temp.left;
			}
			else {
				temp=stack.pop();
				System.out.println(temp.data+" ");
				temp=temp.right;
						
			}
		}
	}
	
	public void PostOrderRecursive(TreeNode root) {
		if(root==null)
			return;
		
		inOrderRecursive(root.left);
		
		inOrderRecursive(root.right);
		
		System.out.println(root.data+"  ");
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(10);
		TreeNode second = new TreeNode(20);
		TreeNode third = new TreeNode(30);
		TreeNode forth = new TreeNode(40);
		TreeNode fifth = new TreeNode(50);
	}
	
	public void levelOrder() {
		if(root==null)
			return;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.println(temp.data+"  ");
			if(temp.left!=null)
				queue.offer(temp.left);
			if(temp.right!=null)
				queue.offer(temp.right);
			
		}
		
	}

}








