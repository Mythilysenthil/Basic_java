package com.files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
public class DemoFiles {
	  public static void main(String[] args) {
	    FileSystem fs = FileSystems.getDefault();	  
		Path p1 = fs.getPath("C:\\Users\\Navee\\OneDrive\\Documents\\Expleo training\\Mavel_Project\\project");
		
		System.out.println(p1);
	  }
	}
