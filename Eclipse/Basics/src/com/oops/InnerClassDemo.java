package com.oops;
class OuterClass {
	int age  = 18;
	public void checkAge() {
		System.out.println("In CheckAge() Method call");
	}
	class InnerClass {
		public void show() {
			System.out.println("In show() Method call of inner class");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OuterClass outer = new OuterClass();
        System.out.println("OuterClass.Age : "+outer.age);
        System.out.println("OuterClass.checkAge() :");
        
        outer.checkAge(); //outerclass method
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.print("Inner Class Method call:");
        inner.show();
	}

}
