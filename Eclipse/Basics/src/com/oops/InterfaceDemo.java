package com.oops;

import com.oops.Circle;
import com.oops.Rectangle;
import com.oops.Shape;

interface Shape {
	double DEFAULT_VALUE = 1.0;
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() {
		return "A Shape with unspecified dimentions";
	}
}
abstract class Circle implements Shape {
	private double radius;
	public Circle (double radius) {
		this.radius = radius;
	}
	public Circle() {
		this.radius = DEFAULT_VALUE;
	}
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	public String getDescription() {
		return "A circle with radius"+radius;
	}
}
class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		this.length = DEFAULT_VALUE;
		this.width = DEFAULT_VALUE;
	}
	public double calculateArea() {
		return length*width;
	}
	public double calculatePerimeter() {
		return 2*(length+width);
	}
	public String getDescription() {
		return "A rectangle with length" + length+ " and width" +width; 
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle circle = new Circle(5);
        Rectangle r = new Rectangle(2,3);
	}
}
