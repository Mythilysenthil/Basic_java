package com.files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class DemoSubfile {
  public static void main(String[] args) {
	Path p1 = Paths.get("C:\\Users\\Navee\\OneDrive\\Documents\\Expleo training\\Mavel_Project\\project");
	Path p2 = p1.subpath(1, 3);
	
	System.out.println(p1);
	System.out.println(p2);
  }
}
