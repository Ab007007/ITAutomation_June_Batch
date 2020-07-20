package com.selenium.basics.popup;

import java.io.IOException;

import com.selenium.basics.utils.ActitimeUtils;

public class FileUploadDemo {

	
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("D:\\ITA\\ITAutomation_June_Batch\\Eclipse_WS\\seleniumTraining\\autoit\\fileupload.exe");
		ActitimeUtils.getDriver();
		ActitimeUtils.launchApp("http://formy-project.herokuapp.com/fileupload");
		ActitimeUtils.click("id", "file-upload-field");
		
	}
}
