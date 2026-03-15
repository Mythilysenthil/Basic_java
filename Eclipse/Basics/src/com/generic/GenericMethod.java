package com.generic;

public class GenericMethod {
	static<T>void genericDisplay(T element){
		System.out.println(element);
		System.out.println(element.getClass().getName()+" = "+element);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling generic method with integer argument
        genericDisplay(11);
        //calling generic method with string argument
        genericDisplay("Test");
       //calling generic method with double argument
        genericDisplay(1.0);
        
	}

}