package com.ita.training.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) {
		
		File file = null;
		FileInputStream fis = null;
		try
		{
			file = new File("data\\globaldata.properties");
			fis = new FileInputStream(file);
			
			Properties props = new Properties();
			
			props.load(fis);
			System.out.println(props.getProperty("Name"));
			System.out.println(props.getProperty("Age"));
			System.out.println(props.getProperty("Phone"));
			System.out.println(props.getProperty("Place"));
			System.out.println(props.getProperty("Location"));
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File not found..");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
		}
		catch(Exception ex )
		{
			System.out.println("generic exception");
		}
		finally {
			
			try 
			{
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}

}
