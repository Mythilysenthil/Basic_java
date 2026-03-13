package com.basics;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ReadMoreInput {
   public static void main(String[] args) {
	   Scanner in =new Scanner(System.in);
	   
	   System.out.println("Enter Movie ID : ");
	   int id = in.nextInt();
	   in.nextLine(); 
	   System.out.println("Enter Movie Name : ");
	   String name = in.nextLine();
	   System.out.println("Enter Movie Description : ");
	   String des = in.nextLine();
	   System.out.println("Enter Movie Language : ");
	   String lan = in.nextLine();
	   System.out.println("Enter Movie Genre : ");
	   String genre = in.nextLine();
	   System.out.println("Enter Movie release date (dd/mm/yyyy) : ");
	   int date = in.nextInt();
	   
	   System.out.println("ENTERED MOVIE DETAILS ARE");
	   System.out.println("Movie ID : "+id);
	   System.out.println("Movie Name : "+name);
	   System.out.println("Movie Description : "+des);
	   System.out.println("Movie Language : "+lan);
	   System.out.println("Movie Genre : "+genre);
	   System.out.println("Movie Date : "+date);
	   
	   in.close();
   }
}
