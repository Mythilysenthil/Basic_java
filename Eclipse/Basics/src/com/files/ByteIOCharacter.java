package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteIOCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = new byte[128];
		try(FileReader fr = new FileReader(args[0]);
		    FileWriter fw = new FileWriter(args[1])) {
			int count =0; int read = 0;
			while((read = fr.read(b))!=-1) {
				fw.write(b,0,read);
				count += read;
			}
			System.out.println("Total Count "+count+ " characters.");
		}catch (FileNotFoundException f) {
			System.out.println("File "+args[0]+ " not found.");
		}catch (IOException e) {
			System.out.println("IOException "+e);
		}
	}

}
