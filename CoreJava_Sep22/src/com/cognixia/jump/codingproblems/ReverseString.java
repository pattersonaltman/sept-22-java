package com.cognixia.jump.codingproblems;

public class ReverseString {

	
	
	
	
	
	
	public static void main(String[] args) {


		
		String s1 = "hello world";
		
		
		System.out.print(reverse1(s1));		System.out.println("\t<-- with in-built functions");
		System.out.print(reverse2(s1));		System.out.println("\t<-- without in-built functions");
		System.out.print(reverse3(s1));		System.out.println("\t<-- reverse individual words");

		

		
		
		
		
	}
	
	
	
	/*
	 * Description: Reverse a string with in-built methods
	 * 
	 * Notes:
	 * 		- StringBuilder object pertains to specific string (passed in as arg)
	 * 		- reverse() returns reference to itself (StringBuilder object)
	 * 		- Need to use the toString() method to convert  StringBuilder --> String , for the return type
	 */
	
	public static String reverse1(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	
	
	/*
	 * Description: Reverse a string without in-built methods
	 * 
	 * Algorithm:
	 * 		- for i = (str.end to str.beginning)
	 * 			- reversed += str[i]
	 * 		- return reversed
	 */
	
	public static String reverse2(String str) {
		
		String reversed = "";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			reversed += str.charAt(i);
		}
		
		return reversed;
	}
	
	
	
	/*
	 * Description: Take a string that can have multiple words in it and reverse the words separately
	 * 
	 * Algorithm:
	 * 		- for i = (str.beginning to str.end)
	 * 			- if: str[i] = whitespace
	 * 				- append to reversed
	 * 			- else: 
	 * 				- get index of last char before next whitespace
	 * 				- reverse str from str[lastIndex,i]
	 * 		- return reversed
	 */
	
	public static String reverse3(String str) {
		
		String reversed = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			/* if char is whitespace, append to @reversed */
			
			if(str.charAt(i) == ' ')
			{
				reversed += str.charAt(i);
			}
			
			else
			{
				/* get index of last char before next whitespace */
				
				int lastIndexOfWord = i;
				
				while((lastIndexOfWord+1) < str.length() && str.charAt(lastIndexOfWord+1) != ' ')
				{
					lastIndexOfWord++;
				}
				
				/* reverse the current word at indices [lastIndexOfWord, i] */
				
				for(int j = lastIndexOfWord; j >= i; j--)
				{
					reversed += str.charAt(j);
				}
				
				i = lastIndexOfWord;	// move i to last index before next whitespace, for-loop 
			}							// incrementation will move i to correct spot (next whitespace)
		}
		
		return reversed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
