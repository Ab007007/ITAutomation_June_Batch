package com.ita.training.java.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("data\\Temp.txt");
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("Buffered writer is easy to use");
		bw.newLine();
		bw.write("cool to use");
		
		bw.close();
		fw.close();
		System.out.println("done");
		
	}
}
