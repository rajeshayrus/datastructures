package com.demo.binarytree;

import java.util.Stack;

public class BinarySearchTree {

	public TreeNode root;

	public class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;

		public TreeNode(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
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

		public void setData(int data) {
			this.data = data;
		}

	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public void insert(int data) {
		// root = insertRecursive(root, data);
		insertIterative(new TreeNode(data));
	}

	public TreeNode insertRecursive(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}
		if (root.data > data) {
			root.left = insertRecursive(root.left, data);
		} else {
			root.right = insertRecursive(root.right, data);
		}
		return root;
	}

	public TreeNode insertIterative(TreeNode node) {
		if (root == null) {
			root = new TreeNode(node.data);
			return root;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = root;
		while (temp != null) {
			if (node.data < temp.data) {
				stack.add(temp);
				temp = temp.left;

			} else {
				stack.add(temp);
				temp = temp.right;

			}
		}
		if (temp == null) {
			if (node.data < stack.peek().data) {
				stack.peek().left = node;
			} else {
				stack.peek().right = node;
			}
		}
		return node;

	}

	/*
	 * How to search key in Binary search tree using recursion
	 */
	public boolean search(int data) {
		TreeNode search = search(root, data);
		return search != null;
	}

	public TreeNode search(TreeNode root, int data) {
		if (root == null || root.data == data) {
			root = new TreeNode(data);
			return root;
		}
		if (root.data > data) {
			return search(root.left, data);
		} else {
			return search(root.right, data);
		}
	}

	public void preOrderRecursive(TreeNode root) {

		if (root == null)
			return;
		System.out.print(root.data + " >  ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
	}

	public void inOrderRecursive(TreeNode root) {
		if (root == null)
			return;

		inOrderRecursive(root.left);

		System.out.print(root.data + " > ");

		inOrderRecursive(root.right);

	}
}
