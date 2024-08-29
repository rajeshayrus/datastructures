package com.demo.binarytree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        System.out.println(bst.root.getLeft().getData());
        bst.insert(3);
        bst.insert(18);
        System.out.println(bst.root.getData());
        bst.insert(14);
        bst.insert(7);
        System.out.println(bst.root.getData());
        bst.preOrderRecursive(bst.root);
        bst.inOrderRecursive(bst.root);
    }
}
