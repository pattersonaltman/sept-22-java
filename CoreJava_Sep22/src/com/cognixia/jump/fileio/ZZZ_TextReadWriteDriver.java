package com.cognixia.jump.fileio;

import java.io.File;
import java.io.IOException;

public class ZZZ_TextReadWriteDriver {

	
	
	public static void main(String[] args) {


		String relativeFilepath = "resources/temp.txt";
		File file = new File(relativeFilepath);
		
		System.out.println("Does file exist?\t" + relativeFilepath + " : " + file.exists());
		
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("File " + file.getName() + " could not be created with path"
						+ " " + file.getPath());
			}
		}
		
	}

	
	
	
	
	
}
