package com.lockedme.classes;

import java.io.File;
import java.util.Scanner;

public class DeleteFiles {
	Scanner scanner = new Scanner(System.in);
	public void fileDeletion(String name) {

		File file = new File(name);
		try {
			if(file.delete()) {
				System.out.println("File " + file.getName() 
				+ " has been Deleted succcessfully.");
			} else {
				System.out.println("Failed to delete File " + file.getName() + ".");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
