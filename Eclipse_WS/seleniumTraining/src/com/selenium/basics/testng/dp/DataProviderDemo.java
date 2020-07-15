package com.selenium.basics.testng.dp;

import org.testng.annotations.Test;

import com.selenium.basics.testng.data.TestData;

public class DataProviderDemo {
	
  @Test(dataProvider = "sampledata", dataProviderClass = TestData.class)
  public void dataProviderTest(Integer n, String s, Double d)
  {
	  System.out.println(n + " - "+ s + " - "+ d);
  }

  
}
