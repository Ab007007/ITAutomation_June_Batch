package com.selenium.basics.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaderUtils extends DriverUtils {

	public static String file = "data//config.properties";
	public static String data_file = "data//actitime_testdata.xls";

	public static File excelFile = null;
	public static Workbook wb = null;
	public static FileInputStream fis = null;
	public static Sheet sh = null;
	public static Row row = null;
	public static Cell cell = null;

	public static String getValue(String propertyName) {
		String value = null;
		File f = null;
		FileInputStream fis = null;
		Properties props = null;
		try {
			f = new File(file);
			fis = new FileInputStream(f);
			props = new Properties();
			props.load(fis);
			value = props.getProperty(propertyName) != null ? props.getProperty(propertyName) : "check your key";

		} catch (Exception e) {
			System.out.println("Exception while reading properties");

		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return value;
	}

	public static Workbook getWorkBook() {
		try {
			excelFile = new File(data_file);
			fis = new FileInputStream(excelFile);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return wb;

	}

	public static Sheet getMySheet(String sheetName)
	{
		wb = getWorkBook();
		sh = wb.getSheet(sheetName);
		return sh;
	}
	
	public static int getRowCount(String sheetName)
	{
		int count = 0;
		sh = getMySheet(sheetName);
		return sh.getLastRowNum() + 1;
		
	}
	
	public static String getCellData(String sheetName, int rowNum, int colNum)
	{
		String value = null;
		sh = getMySheet(sheetName);
		row = sh.getRow(rowNum);
		value = row.getCell(colNum).getStringCellValue();
		return value;
	}
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("File writing demo");
		wb = getWorkBook();
		sh = wb.getSheet("createProject");
		for(int i = 0 ; i<20 ; i ++)
		{
			row = sh.createRow(i);
			cell = row.createCell(0);
			Cell cell2 = row.createCell(1);
			cell.setCellValue("i'm from Program" + i);
			//cell.setCellStyle();
			cell2.setCellValue("Woow");
		}
		FileOutputStream fos = new FileOutputStream(data_file);
		wb.write(fos);
		fos.flush();
		fos.close();
		System.out.println("ended");
		
				
		
		
	}
	
	
	
	
	
	
	/*
	 * public static void main(String[] args) throws EncryptedDocumentException,
	 * IOException {
	 * 
	 * int numberofSheets = wb.getNumberOfSheets();
	 * 
	 * System.out.println("total number of sheets " + numberofSheets);
	 * 
	 * for (int i = 0; i < numberofSheets; i++) {
	 * System.out.println(wb.getSheetName(i)); }
	 * 
	 * Sheet sh = wb.getSheet("createCustomer"); int rowCount = sh.getLastRowNum() +
	 * 1; System.out.println("Total rows " + rowCount);
	 * 
	 * for (int i = 0; i < rowCount; i++) { Row row = sh.getRow(i);
	 * System.out.println(row.getCell(0) + " | " + row.getCell(1)); }
	 * 
	 * }
	 */
}
