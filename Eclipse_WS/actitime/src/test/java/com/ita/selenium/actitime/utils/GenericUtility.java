package com.ita.selenium.actitime.utils;

import java.util.Date;

public class GenericUtility {

	

	public static String getDateAndTime()
	{
		Date d = new Date();
		return d.toString().replaceAll(" ", "_").replaceAll(":", "_");
	}
}
