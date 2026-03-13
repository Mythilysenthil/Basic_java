package com.basics;
import java.util.*;
public class IfElseIf {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Type of seats Available\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nchoose any one of the option: ");
	   
	   String seatType = in.next();
	   if(seatType.equals("REGULAR")) {
		   System.out.println("You have selected Regular Seat and cost is Rs.80");
	   }
	   else if(seatType.equals("EXECUTIVE")) {
		   System.out.println("You have selected Executive Seat and cost is Rs.100");
	   }
	   else if(seatType.equals("PREMIUM")) {
		   System.out.println("You have selected Premium Seat and cost is Rs.120");
	   }
	   else if(seatType.equals("VIP")) {
		   System.out.println("You have selected Executive Seat and cost is Rs.150");  
	   }
	   else {
		   System.out.println("You have not selected any type");
	   }
	   in.close();
   }
   
}
