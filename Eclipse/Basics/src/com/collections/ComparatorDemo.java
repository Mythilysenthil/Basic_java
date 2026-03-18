package com.collections;
import java.util.*;
//import java.io.*;

class Mobiles implements Comparable<Mobiles>{
	private String name;
	private int ram;
	private int price;
	public Mobiles(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(Mobiles o) {
		if(this.ram > o.getRam()) {
			return 1;  
		}else {
			return -1;
		}
	}
}
class PriceCompare implements Comparator<Mobiles>{
	public int compare(Mobiles m1,Mobiles m2) {
		if(m1.getPrice()<m2.getPrice()) return -1;
		if(m1.getPrice()>m2.getPrice()) return 1;
		else return 0;
	}
}

class NameCompare implements Comparator<Mobiles>{
    public int compare(Mobiles m1, Mobiles m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Mobiles>mobileList = new ArrayList<>();
        mobileList.add(new Mobiles("Redme", 16, 800));
        mobileList.add(new Mobiles("Apple", 8, 100));
        mobileList.add(new Mobiles("Samsung", 4, 600));
        System.out.println("Sorted by price");
        PriceCompare priceCompare = new PriceCompare();
        Collections.sort(mobileList,priceCompare);
        System.out.println("Mobile after price sorting :");
        System.out.println("Name" +"\t"+ "Ram"+"\t"+"Price");
        for(Mobiles mb: mobileList) {
           System.out.println(mb.getName()+ "\t" + mb.getRam()+ "\t" +mb.getPrice());
        }
	}

}
