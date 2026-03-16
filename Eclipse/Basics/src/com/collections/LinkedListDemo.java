package com.collections;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a LinkedList
        LinkedList<String> list = new LinkedList<String>();
        //display initial size
        System.out.println("Size at beginning "+list.size());
        //add element
        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        list.addFirst("C#");
        list.addLast("Kotlin");
        list.add(2, "Python");
        System.out.println("Original Linked List "+list);
        System.out.println("Size after addition "+list.size());
        //remove element
        list.remove(5);
        list.remove("C#");
        System.out.println("New Linked List "+list);
        System.out.println("Size after removal "+list.size());
	}

}
