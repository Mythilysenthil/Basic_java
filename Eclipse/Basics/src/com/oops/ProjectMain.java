package com.oops;
class Project1 {
	String proLeadName = "Ram";
	int empId = 1000;
	void displayData() {
		System.out.println("Project Leader Name : "+proLeadName);
		System.out.println("Project Leader Id : "+empId);
	}
}
class ProjectEmployee extends Project1{
	String progName;
	int empId;
	void setData(String name, int id) {
		progName = name;
		empId = id;
	}
	
	void display() {
		System.out.println("Programmer Name : "+progName);
		System.out.println("Programmer Emp Id : "+empId);
		super.displayData();
	}
}
public class ProjectMain {
	public static void main(String[] args) {
		Programmer p = new Programmer();
	    p.setData("Mythily", 1001);
	    p.displayData();
	}
	
}
