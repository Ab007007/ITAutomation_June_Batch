package com.ita.training.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("data\\Dummy.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		
		br.close();
		fr.close();
	}
}
