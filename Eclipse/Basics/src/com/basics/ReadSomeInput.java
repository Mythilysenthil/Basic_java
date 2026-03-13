package com.basics;

import java.util.Scanner;

public class ReadSomeInput {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter your Name: ");
    	String name = in.next();
    	System.out.println("Hi "+name+". Welcome to the training program...");
    	
    	in.close();
    }
}
