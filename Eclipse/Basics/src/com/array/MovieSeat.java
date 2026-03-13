package com.array;

public class MovieSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[][] seatType = new String[][]{{"B","B","A","A","A"},{"A","A","A","B","B"},{"A","B","B","B","B"},{"B","A","A","B","A"}};
        int vip =0,premium=0,regular=0,vipTotal=5,premiumTotal=10,regularTotal=5;
        System.out.println("___MOVIE SEATS ARRANGEMENT___");
        for(int i=0; i< seatType.length; i++) {
        	if(i==0) {
        		System.out.println("______VIP SEATS______");
        	}else if(i==1) {
        		System.out.println("____PREMIUM SEATS____");
        	}else if(i==3) {
        		System.out.println("____REGULAR SEATS____");
        	}
        	for(int j=0; j<seatType[i].length; j++) {
        		System.out.print(" "+seatType[i][j]+" ");
        		if(i==0 && seatType[i][j].equalsIgnoreCase("B")) {vip++;}
        		else if(i>0 && i<3 && seatType[i][j].equalsIgnoreCase("B")) {premium++;}
        		else if(i==3 && seatType[i][j].equalsIgnoreCase("B")) {regular++;}
        	}
        	System.out.println();
        }
        System.out.println("______SEAT BOOKED DETAIL______");
        System.out.println("__________VIP SEATS___________");
        System.out.println("BOOKED: "+vip+"AVAILABLE: "+(vipTotal-vip)+"TOTAL: "+vipTotal);
        System.out.println("_________PREMIUM SEATS________");
        System.out.println("BOOKED: "+premium+"AVAILABLE: "+(premiumTotal-premium)+"TOTAL: "+premiumTotal);
        System.out.println("_________REGULAR SEATS________");
        System.out.println("BOOKED: "+regular+"AVAILABLE: "+(regularTotal-regular)+"TOTAL: "+regularTotal);
	}

}
