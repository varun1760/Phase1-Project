package com.lockedme.classes;

import java.util.Scanner;

public class FileManager {
	Scanner scanner = new Scanner(System.in);
	String fileName;
	
	public void createFile() {
		System.out.print("Enter Your File Name: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".txt";
		
		CreateFiles create = new CreateFiles();
		create.fileCreation(fileName);
	}
	
	public void deleteFile() {
		System.out.print("Enter Your File Name: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".txt";
		
		DeleteFiles delete = new DeleteFiles();
		delete.fileDeletion(fileName);
	}
	
	public void searchFile() {
		System.out.print("Enter location: ");
		String directory = scanner.nextLine();
		System.out.print("Enter Your File Name without .txt: ");
		fileName = scanner.nextLine();
		fileName = fileName + ".txt";
		SearchFiles search = new SearchFiles();
		search.fileFinder(directory, fileName);
	}
	
	public void arrangeFile() {
		System.out.print("Enter Folder location to Arrange Files : ");
		String directory = scanner.nextLine();
		SortFiles sort = new SortFiles();
		sort.arrange(directory);
	}
}
