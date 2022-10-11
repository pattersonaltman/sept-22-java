package com.cognixia.jump.codingproblems;

public class SwapNumbers {

	
	
	
	
	
	
	public static void main(String[] args) {


		int x = 1;
		int y = 9;
		
		swap(x,y);
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		
	}

	
	
	/*
	 * Notes:
	 * 
	 * Challenge:
	 * 	- Do not use a third temporary value to do the swap
	 */
	public static void swap(int x, int y) {
		
		y += x;
		x = y - x;
		y -= x;
		
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
