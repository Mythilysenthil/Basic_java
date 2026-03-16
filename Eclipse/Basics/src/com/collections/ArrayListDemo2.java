package com.collections;
import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Initial size of ArrayList is "+arr.size());
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("After insert the size of Arraylist is "+arr.size());
        System.out.println("Content of the ArrayList : "+arr);
        Integer ia[] = new Integer[arr.size()];
        ia = arr.toArray(ia);
        int sum =0;
        for (int i : ia) {
        	sum += i;
        }
        System.out.println("Sum of value is "+sum);
 	}

}
