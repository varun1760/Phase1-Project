package com.lockedme.classes;

import java.io.File;

public class SearchFiles {
	public void fileFinder(String directory, String name) {
		File fName = new File(name);
		File location = new File(directory);
		String[] fileList = location.list();
		int flag = 0;
		if (fileList == null) {
			System.out.println("Folder has no Files.");
		} else {
			for (String file : fileList) {
				if (file.equalsIgnoreCase(name)) {
//					TODO: print Metadata
					System.out.println("File Found. Here is Details:");
					flag = 1;
					System.out.println("Name: " + fName.getName());
					System.out.println("Location: " + fName.getAbsolutePath());
					System.out.println("Size: " + fName.length());
					System.out.println("Writable: " + fName.canWrite());
					System.out.println("Readable: " + fName.canRead());
				}
			}
		}
		if (flag == 0) {
			System.out.println("File Not Found");
		}
	}
}
