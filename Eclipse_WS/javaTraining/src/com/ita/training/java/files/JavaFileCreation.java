package com.ita.training.java.files;

import java.io.File;
import java.io.IOException;

public class JavaFileCreation {

	public static void main(String[] args) throws IOException {
		File file = new File("data\\myjava.txt");
		if(!file.exists())
		{
			file.createNewFile();
			System.out.println("Crated new file");
		}
		else
		{
			System.out.println("File already exist");
		}
	}
}
