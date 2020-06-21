package com.ita.training.java.files;

import java.io.File;

public class FilesDemo {

	public static void main(String[] args) {
		File f = new File("data");
		
		System.out.println(f.getAbsolutePath());
		String[] dirs = f.list();
		
		for(String folder:dirs)
		{
			System.out.println(folder);
		}
	}
}
