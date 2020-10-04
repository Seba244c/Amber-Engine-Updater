package dk.sebsa.amber_updater;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {
	public static void main(String[] args) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { e.printStackTrace(); }
		String dir = System.getProperty("user.dir");
		
		File download = new File(dir+"/Amber-Workspace/.temp/newest.jar");
		
		File newFile = new File(args[0]);
		newFile.delete();
		newFile = new File(args[0]);
		
		try {
			FileUtils.moveFile(download, newFile);
		} catch (IOException e) { e.printStackTrace(); }
	}
}
