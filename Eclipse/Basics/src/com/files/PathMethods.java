package com.files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Path p1 = Paths.get("C:\\Users\\Navee\\OneDrive\\Documents\\Expleo training\\Mavel_Project\\project");
        Path normalizedPath = p1.normalize();
        Path p2 = Paths.get("C:\\Users\\Navee\\OneDrive\\Documents\\Expleo training\\Mavel_Project\\project");
        System.out.println("NormalizedPath: "+normalizedPath);
        Path subPath = p1.subpath(1, 3);
        System.out.println("SubPath: "+subPath);
        System.out.println("getFileName: "+p1.getFileName());
        System.out.println("getParent: "+p1.getParent());
        System.out.println("getNameCount: "+p1.getNameCount());
        System.out.println("getRoot: "+p1.getRoot());
        System.out.println("IsAbsolute: "+p1.isAbsolute());
        System.out.println("toAbsolutePath: "+p1.toAbsolutePath());
        System.out.println("toURi: "+p1.toUri());
        if(p1.equals(p2)) {
        	System.out.println("Both are equal");
        }else {
        	System.out.println("Both are not equal");
        }
	}

}
