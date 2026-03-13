package com.files;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class SoftLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Path existingFilePath = Paths.get("C:\\Users\\Navee\\OneDrive\\Documents\\Expleo training\\Mavel_Project\\project");
        Path sysLinkPath = Paths.get("C:\\project");
        try {
        	Files.createSymbolicLink(sysLinkPath, existingFilePath);
        }catch(IOException x) {
        	System.err.println(x);
        }catch(UnsupportedOperationException x) {
        	System.err.println(x);
        }
	}

}
