package com.oops;
class vehicles {
	void run() {
		System.out.println("Vehicle  is running");
	}
}
class Truck extends vehicles {
	void run() {
		System.out.println("Truck is running");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        vehicles obj = new vehicles();
        obj.run();
        vehicles obj1 = new Truck();
        obj1.run();
	}

}
