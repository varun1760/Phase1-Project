package com.lockedme.classes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFiles {
	Scanner scanner = new Scanner(System.in);

	public void fileCreation(String name) {

		File file = new File(name);
		try {
			if (file.createNewFile()) {
				System.out.println("File " + file.getName() + " created successfully.");
			} else {
				System.out.println("File " + file.getName() + " already exist.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
