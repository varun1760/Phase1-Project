package com.lockedme.classes;

import java.util.Scanner;

public class Menu extends FileManager{
	Scanner scanner = new Scanner(System.in);
	
	public void mainMenu() {
		int goThere = 0;
		do {			
			switch (goThere) {
			case 0:{
				System.out.println();
				System.out.println("Please Select and Type your options given below:");
				System.out.println("***********************************");
				System.out.println(" 1 : File Names in Ascending Order.");
				System.out.println(" 2 : File Operations.");
				System.out.println(" 3 : Exit The Application.");
				
				goThere = scanner.nextInt();
				continue;
			}
			case 1: {
				arrangeFile();
				goThere = 0;
				continue;
			}
			case 2: {
				secondMenu();
				goThere = 0;
				continue;
			}
			case 3: {
				System.out.println("Exiting the Application...");
				System.exit(0);
			}
			default: {
				System.out.println("Please enter a valid option");
				System.out.println();
				goThere = 0;
				continue;
			}
			}
		} while (true);
	}
	
	public void secondMenu() {
		int goHere = 0;
		do {			
			switch (goHere) {
			case 0:{
				System.out.println();
				System.out.println("Please Select Sub Menu:");
				System.out.println("***********************************");
				System.out.println(" 1 : Create a File.");
				System.out.println(" 2 : Delete a File.");
				System.out.println(" 3 : Search a File.");
				System.out.println(" 4 : Main Menu");
				System.out.println(" 5 : Exit the Application");
				goHere = scanner.nextInt();
				continue;
			}
			case 1: {
				createFile();
				goHere = 0;
				continue;
			}
			case 2: {
				deleteFile();
				goHere = 0;
				continue;
			}
			case 3: {
				searchFile();
				goHere = 0;
				continue;
			}
			case 4: {
				mainMenu();
				break;
			}
			case 5: {
				System.out.println("Exiting the Application");
				System.exit(0);
			}
			default: {
				System.out.println("Please enter a valid option");
				System.out.println("OR");
				goHere = 0;
				continue;
			}
			}
		} while (true);
	}
}
