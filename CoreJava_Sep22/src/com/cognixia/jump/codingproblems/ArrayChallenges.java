package com.cognixia.jump.codingproblems;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenges {

	
	
	
	
	public static void main(String[] args) {

		
		//Challenge 1

		int[] a = {1,3,5,0};
		int[] b = {0,5,1,3};
		
		int[] c = {3,5,4,0};
		int[] d = {0,5,1,3};
		
		System.out.println(challenge1(a,b));
		System.out.println(challenge1(c,d));
		
		
		
		
		//Challenge 2
		
		
		
		int[] e = new int[100];
		
		for(int i = 0; i < 100; i++)
		{
			e[i] = i+1;
		}
		
		Random rand = new Random();
		
		e[Math.abs(rand.nextInt()) % 99] = -1;
		
		for(int i = 0; i < e.length; i++)
		{
			System.out.print(e[i] + ", ");
		}
		
		System.out.println("\n" + challenge2(e));

		
		
		
		
	}
	
	
	
	/* 
	 * Method:  
	 *  
	 * - Description:  
	 *  
	 * - Notes: 
	 * 		- Uses Arrays.sort() method
	 *  
	 * - Constraints: 
	 * 
	 * - Challenge: 
	 * 		- have 2 arrays to compare
	 * 		- Check if the 2 arrays match (same values, can be different indices)
	 */ 
	
	public static boolean challenge1(int[] arr1, int[] arr2) {
		
		/* Base Case: Check size/cardinality */
		
		if(arr1.length != arr2.length)
		{
			return false;
		}
		
		
		/* Assuming the two arrays are equal size, Sort & check if all indices are equal */
		
		//Sort
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//loop over @arr1 and @arr2 -- return false if any elements are not equal, otherwise true
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] != arr2[i])
			{
				return false;
			}
		}

		/* equal if reached this point */
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	/* 
	 * Method:  
	 *  
	 * - Description:  
	 *  
	 * - Notes: 
	 * 		- Integer.MIN_VALUE is used to represent an error code -- required for compilation, 
	 * 			but that point in code should not be reachable
	 *  
	 * - Constraints: 
	 * 		- Since Integer.MIN_VALUE is used as a an error code -- if Integer.MIN_VALUE (-2147483648) 
	 * 			was an element in the array, you would not be able to distinguish between a successful answer 
	 * 			or an error.
	 * 
	 * - Algorithm:
	 * 		- Loop over elements [1,100]
	 * 			- Loop over @arr
	 * 				- if next element is found in @arr, break
	 * 				- if last element of @arr is reached without breaking, 
	 * 					this is missing element, return
	 * 
	 * 		- return Integer.MIN_VALUE (error code, should not reach this point) 
	 * 
	 * - Challenge:
	 * 		- Find the single missing integer in a given array of ints
	 */ 

	public static int challenge2(int[] arr) {
		
		for(int i = 1; i <= 100; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(i == arr[j])
				{
					break;
				}
				
				if(j == (arr.length - 1))
				{
					return i;
				}
			}
		}

		return Integer.MIN_VALUE;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * ------------------------------- Alternate Solutions ------------------------------------
	 */
	
	
	
	
	/*
	 * Notes:
	 * 		- Assumes sorted array from 1-100
	 */
	
	public static int challenge2_1(int[] arr) {
			
			for(int i = 1; i < arr.length-1; i++) {
				if(arr[i-1] + 1 != arr[i]){
					return arr[i-1] + 1;
				}
			}
			return 0;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
