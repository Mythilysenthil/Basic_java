package com.files;
import java.io.FileOutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data = "Welcome to Java Portal!!! Have a Happy Learning";
        try {
        	FileOutputStream output = new FileOutputStream("output.txt");
        	byte[] array = data.getBytes();
        	output.write(array);
        	output.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
