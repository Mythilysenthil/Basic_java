package com.collections;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Default size
        Vector<String> v= new Vector<String>();
        System.out.println("Size of the vector is "+v.size());
        System.out.println("Capacity before initialize of vector is "+v.capacity());
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        System.out.println("Element in the vector "+v);
        System.out.println("Size of the vector is "+v.size());
        System.out.println("Capacity of the vector is "+v.capacity());
        
        //Size declared
        v = new Vector<String>(2, 3);

        System.out.println("Capacity after using (size, incr): " + v.capacity());
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        System.out.println("Elements in the vector: " + v);
        System.out.println("Size of the vector: " + v.size());
        System.out.println("Capacity of the vector: " + v.capacity());
	}

}
