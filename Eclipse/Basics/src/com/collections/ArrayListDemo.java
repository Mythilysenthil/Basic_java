package com.collections;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an Arraylist
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Initial size of Array List is: "+arr.size());
        arr.add("C");
        arr.add("A");
        arr.add("E");
        arr.add("B");
        arr.add("D");
        arr.add("F");
        arr.add(1,"G");
        System.out.println("After insert the size of Arraylist is: "+arr.size());
        System.out.println("Contents of the ArrayList: "+arr);
        //Remove Element from ArrayList
        arr.remove("f");
        arr.remove(2);
        System.out.println("Contents of the ArrayList: "+arr);
	}

}
