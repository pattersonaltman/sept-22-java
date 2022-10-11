package com.cognixia.jump.javabasics;

import java.util.Scanner;

public class ZZZ_ReadFromConsole {

	public static void main(String[] args) {


		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("(You technically need to open the console yourself when prompting\n"
				+ "for scanner input, otherwise it will not open itself with a .next__() method.\n"
				+ "You can either open the console by having some print statement prior,\n"
				+ "or by just manually opening it yourself)\n\n\n\n\n\n");
		
		
		String input = in.nextLine();
		
		System.out.println(input);
		
	}

}
