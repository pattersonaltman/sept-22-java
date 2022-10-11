package com.cognixia.jump.codingproblems;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentStrings {

	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		List<String> s1 = new ArrayList();
		s1.add("Johnny");
		s1.add("Bobby");
		s1.add("Alex");
		s1.add("Gia");
		s1.add("Thanos");
		
		
		Driver1(s1);
		
		
		

	}
	
	
	
	
	public static void Driver1(List<String> students) {

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 4)
		{
			try {
				menu();
				choice = scan.nextInt();
				
				if(choice == 1)
				{
					try {
						System.out.println("Enter the number of the index you would like to search ...");
						int index = scan.nextInt();
						System.out.println("\n\n" + get(index, students));
					} 
					catch(IndexOutOfBoundsException e) 
					{
						System.out.println("\nError: That index was out of bounds");
					}
					catch(InputMismatchException e)
					{
						System.out.println("\nError: That index was out of bounds");
						scan.nextLine();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				else if(choice == 2)
				{
					System.out.println("Enter the name of the student ...");
					scan.nextLine();
					String student = scan.nextLine();
					System.out.println("\n");
					System.out.println(get(student, students)); 
				}
				else if(choice == 3) 
				{
					System.out.println("Enter the student's name you would like to add ...");
					scan.nextLine();
					String newStudent = scan.nextLine();
					add(newStudent, students);
				}
				else if(choice == 4) 
				{
					scan.close();
					System.exit(0);
				}
				else
				{
					System.out.println("\nInvalid menu entry: Please enter a choice between 1-4 ...\n");
				}
			} catch(InputMismatchException e) 
			{
				System.out.println("\nError: Input out of range, Please enter a choice between 1-4 ...");
				scan.nextLine();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		scan.close();
	}
	
	
	

	

	public static String get(int index, List<String> students) {
			return students.get(index);
	}
	
	
	
	//TODO: add implementation for: if multiple students of same name
	public static String get(String student, List<String> students) {
		
		for(int i = 0; i < students.size(); i++)
		{
			if(student.equals(students.get(i)))
			{
				System.out.println("Index: "+ i);
				return students.get(i);
			}
		}
		
		return null;
	}
	
	
	public static void add(String newStudent, List<String> students) {
		students.add(newStudent);
	}
	
	
	
	
	public static void menu() {
		
		System.out.println("\n\n\tMenu\n\n"
				+ "What would you like to do?\n\n"
				+ "1. Find by index\n"
				+ "2. Find by name\n"
				+ "3. Add student\n"
				+ "4. Exit");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
