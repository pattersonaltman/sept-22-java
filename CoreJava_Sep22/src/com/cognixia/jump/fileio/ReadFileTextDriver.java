package com.cognixia.jump.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTextDriver {

	
	
	
	
	public static void main(String[] args) {


		File file = new File("resources/temp.txt");
		FileReader fileReader = null;
		BufferedReader reader = null;
		
		
		try
		{
			
			fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
			
			int charValue;
			
			while((charValue = reader.read()) != -1)
			{
				char letter = (char) charValue;
				
				System.out.print(letter);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				reader.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		
	}

	
	
	
	
	
	
	
	
	
}
