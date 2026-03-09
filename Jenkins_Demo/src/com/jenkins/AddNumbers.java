package com.jenkins;
import java.util.*;
public class AddNumbers {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = in.nextInt();
		System.out.println("Enter b value :");
		int b = in.nextInt();
		int sum = a + b;

		System.out.println("Sum = " + sum);
		in.close();
	}
}
