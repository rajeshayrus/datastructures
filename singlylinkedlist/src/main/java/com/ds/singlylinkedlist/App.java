package com.ds.singlylinkedlist;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	SinglyLinkedList sl = new SinglyLinkedList();
    	//sl.print();
    	sl.add(10);
    	//sl.print();
    	sl.add(13);
    	//sl.print();
    	sl.add(19);
    	sl.add(25);
    	sl.add(32);
    	//sl.print();
    	//sl.insertAt(45, 3);
    	sl.print();
    	//sl.deleteHead();
    	//sl.deleteTail();
    	//sl.print();
    	//System.out.println(sl.search(10));
    	//System.out.println(sl.getHead().getData()+":"+sl.getHead().getNextNode());
    	//SinglyLinkedList reverseList = SinglyLinkedList.reverseList(sl);

    	SinglyLinkedList.reverseList(sl);
    	sl.print();
    	//reverseList.print();
    	SinglyLinkedList sl1 = new SinglyLinkedList();
//    	sl1.add(11);
//    	sl1.add(15);
//    	sl1.add(27);
//    	sl1.print();
//    	sl1.merge(sl, sl1);
//    	sl.print();
    	
    }
}
