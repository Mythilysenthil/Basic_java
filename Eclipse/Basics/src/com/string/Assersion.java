package com.string;

public class Assersion {

	public static void main(String[] args) {

		int age = 10;
		assert age >= 18 : "Age must be 18 or above";
		System.out.println("Age is valid");
	}
}
