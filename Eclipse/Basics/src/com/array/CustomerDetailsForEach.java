package com.array;

public class CustomerDetailsForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] cusName = new String[5];
        cusName[0] = "Sam";
        cusName[1] = "Ram";
        cusName[2] = "Som";
        cusName[3] = "Gop";
        cusName[4] = "Kav";
        
        for(String Name : cusName) {
        	System.out.println(Name);
        }
	}

}
