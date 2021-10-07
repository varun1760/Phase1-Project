package com.lockedme.classes;

import java.io.File;
import java.util.Arrays;


public class SortFiles {
	public void arrange(String directory) {
		File folder = new File(directory);
		File[] fileList = folder.listFiles();
		
		if(fileList == null) {
			System.out.println("Folder is Empty.");
		} else {
			Arrays.sort(fileList, (file1, file2) -> file1.compareTo(file2));
			for(File file : fileList) {
				if(file.isDirectory()) {
					System.out.println("Folder: " + file.getName());
				} else {
					System.out.println("File: " + file.getName());
				}
			}
		}
	}
}
