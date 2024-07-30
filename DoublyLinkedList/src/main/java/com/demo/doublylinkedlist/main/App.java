package com.demo.doublylinkedlist.main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DoublyLinkedList dll = new DoublyLinkedList();
    	dll.print();
    	dll.addFirst(10);
    	dll.addFirst(11);
    	dll.addFirst(12);
    	dll.print();
    	System.out.println(dll.length());
    	dll.deleteFirstNode();
    	dll.print();
    }
}
