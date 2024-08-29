package com.demo.avltree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AVLTree {

	public TreeNode root;

	@Getter
	@Setter
	public class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;
		private int height;

		public TreeNode(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
			this.height = 1;
		}

	}

	int height(TreeNode n) {
		if (n == null)
			return 0;

		return n.height;
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// A utility function to right rotate subtree rooted with y
	TreeNode rightRotate(TreeNode y) {
		TreeNode x = y.left;
		TreeNode T2 = x.right;

		// Perform rotation
		x.right = y;
		y.left = T2;

		// Update heights
		y.height = max(height(y.left), height(y.right)) + 1;
		x.height = max(height(x.left), height(x.right)) + 1;

		// Return new root
		return x;
	}

	// A utility function to left rotate subtree rooted with x
	TreeNode leftRotate(TreeNode x) {
		TreeNode y = x.right;
		TreeNode T2 = y.left;

		// Perform rotation
		y.left = x;
		x.right = T2;

		// Update heights
		x.height = max(height(x.left), height(x.right)) + 1;
		y.height = max(height(y.left), height(y.right)) + 1;

		// Return new root
		return y;
	}

	// Get Balance factor of node N
	int getBalance(TreeNode n) {
		if (n == null)
			return 0;

		return height(n.left) - height(n.right);
	}

	public void insert(int data) {
		root = insertRecursive(root, data);

	}

	public TreeNode insertRecursive(TreeNode root, int data) {

		/* 1. normal BST insertion */
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}
		if (root.data > data) {
			root.left = insertRecursive(root.left, data);
		} else {
			root.right = insertRecursive(root.right, data);
		}

		/* 2. Update height of this ancestor node */
		root.height = 1 + max(height(root.left), height(root.right));

		/*
		 * 3. Get the balance factor of this ancestor node to check whether this node
		 * became unbalanced
		 */
		int balance = getBalance(root);

		// If this node becomes unbalanced
		// Left Left Case
		if (balance > 1 && data < root.left.data)
			return rightRotate(root);

		// Right Right Case
		if (balance < -1 && data > root.right.data)
			return leftRotate(root);

		// Left Right Case
		if (balance > 1 && data > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// Right Left Case
		if (balance < -1 && data < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}
		return root;
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
