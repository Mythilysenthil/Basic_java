package com.oops;

class person{
	int age = 21; static int weight = 45;
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("In NonStatic Dsiplay Method");
			System.out.println("Weight Value : "+weight);
		}
		static void staticDisplay() {
			System.out.println("In static display method");
			System.out.println("Weight value:" +weight);
		}
	}
	Gender g = new Gender();
}
public class InnerClass_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        person p = new person();
        p.g.nonStaticDisplay();
        person.Gender.staticDisplay();
	}

}
