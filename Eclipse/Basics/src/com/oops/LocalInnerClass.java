package com.oops;
class Outer{
	int value  = 56;
	public void outerClassMethod() {
		System.out.println("Inside the method of outer class");
		class Inner{
			public void innerClassMethod() {
				System.out.println("Inside the method of inner class");
				System.out.println("Value:"+value);
			}
		}
		Inner inner  = new Inner();
		inner.innerClassMethod();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer outer = new Outer();
        outer.outerClassMethod();
	}

}
