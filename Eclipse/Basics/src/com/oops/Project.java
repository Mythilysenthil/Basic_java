package com.oops;
class ProjectLeader{ //parent class
	String proLeadName = "Ram";
	int empId = 1000;
}
class Programmer extends ProjectLeader {  //child class
	String progName;
	int empId;
	void setData(String name, int id) {
		progName = name;
		empId = id;
	}
	
	void displayData() {
		System.out.println("Project Leader Name : " + super.proLeadName);
        System.out.println("Project Leader Emp ID : " + super.empId);
        System.out.println("Programmer Name : " + progName);
        System.out.println("Programmer Emp ID : " + empId);
	}
}
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Programmer p = new Programmer();
        p.setData("Mythily", 1001);
        p.displayData();
	}

}
