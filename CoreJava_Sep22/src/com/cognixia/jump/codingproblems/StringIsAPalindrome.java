package com.cognixia.jump.codingproblems;

public class StringIsAPalindrome {

	
	
	
	
	
	public static void main(String[] args) {

		
		System.out.println(isPalindrome("hello"));	//odd length non-palindrome
		System.out.println(isPalindrome("helloo"));	//even length non-palindrome
		System.out.println(isPalindrome("lool"));	//even length palindrome
		System.out.println(isPalindrome("loool"));	//odd length palindrome
		System.out.println(isPalindrome("12345678900987654321"));
		System.out.println(isPalindrome("-12345678900987654321"));
		
		System.out.println();
		
		System.out.println(isPalindrome2("hello"));	
		System.out.println(isPalindrome2("helloo"));
		System.out.println(isPalindrome2("lool"));
		System.out.println(isPalindrome2("loool"));
		System.out.println(isPalindrome2("12345678900987654321"));
		System.out.println(isPalindrome2("-12345678900987654321"));
		
		

	}
	
	
	
	
	public static boolean isPalindrome2(String str) {
		
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length() / 2; i++)
		{
			if(str.charAt(i) != str.charAt((str.length() - 1 - i)))
			{
				return false;
			}
		}
		return true;	//String is a palindrome if reaches this point, return true
	}
	
	
	

	
	
	public static boolean isPalindrome(String str) {
		
		str = str.toLowerCase();	//make case-insensitive
		
		if(str.length() % 2 == 0)	//even length
		{
			int rightMidpoint = str.length() / 2;
			int leftMidpoint = rightMidpoint - 1;
			
			for(int i = 0, j = (str.length() - 1); i <= leftMidpoint && j >= rightMidpoint; i++, j--)
			{
				if(str.charAt(i) != str.charAt(j))
				{
					return false;
				}
			}
		}
		else	//odd length
		{
			int midpoint = str.length() / 2;
			
			for(int i = 0, j = (str.length() - 1); i < midpoint && j > midpoint; i++, j--)
			{
				if(str.charAt(i) != str.charAt(j))
				{
					return false;
				}
			}
		}
		
		//String is a palindrome if reaches this point, return true
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
