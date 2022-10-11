package com.cognixia.jump.javabasics;

public class StaticDemoClass {

	
	
	
	public StaticDemoClass() {
		System.out.println("constructor");
	}
	
	
	{
		System.out.println("anonymous code block");		
	}
	
	
	static 
	{
		System.out.println("static code block");
	}
	
	
	
	
	public static void staticMethod() {
		System.out.println("static method");
	}
	
	
	
}
