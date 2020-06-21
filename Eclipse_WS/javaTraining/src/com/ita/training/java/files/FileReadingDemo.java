package com.ita.training.java.files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemo {

	
	public static void main(String[] args) throws IOException {
		
		File file  =  new File("data\\Dummy.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i = 0;
		while((i=fis.read()) != -1)
		{
			System.out.println((char)i);
		}
		fis.close();
		
	}
}
