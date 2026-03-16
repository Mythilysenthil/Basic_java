package com.collections;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> stk = new Stack<String>();
        System.out.println("Size of the Stack is "+stk.size());
        stk.push("A");
        stk.push("B");
        stk.push("C");
        stk.push("D");
        System.out.println("Elements in the stack: "+stk);
        System.out.println("Size of the Stack is "+stk.size());
        System.out.println("Topmost elememt is "+stk.peek());
        stk.pop();
        System.out.println("Element in the stack after remove "+stk);
        System.out.println("Size of the stack after remove is "+stk.size());
        System.out.println("Topmost elememt is "+stk.peek());
	}

}
