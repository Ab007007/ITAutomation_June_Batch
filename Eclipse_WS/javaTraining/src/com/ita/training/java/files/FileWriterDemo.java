package com.ita.training.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("data\\Temp.txt");
		String str = "\nMy java program is writing this line...!!!";
		FileOutputStream fos = new FileOutputStream(file, true);
		fos.write(str.getBytes());
		fos.close();
		System.out.println("DONE");
		
		
	}
}
