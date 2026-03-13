package com.basics;

public class ConversionExplicit {
    public static void main(String[] args) {
    	double d = 100.04;
    	long I = (long)d;
    	int i = (int)I;
    	System.out.println("Double value: "+d);
    	System.out.println("Long value: "+I);
    	System.out.println("Int value: "+i);
    }
}
