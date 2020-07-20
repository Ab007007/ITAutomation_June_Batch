package com.selenium.basics.testng.data;

import org.testng.annotations.DataProvider;

public class TestData {

	
	@DataProvider
	  public Object[][] sampledata() {
	    return new Object[][] {
	      new Object[] { 1, "a", 12.22 },
	      new Object[] { 2, "b", 23.33 },
	      new Object[] { 3, "c", 3.33 },
	      new Object[] { 4, "d", 23.33 },
	      new Object[] { 5, "e", 3.33 },
	      new Object[] { 6, "f", 23.33 },
	      new Object[] { 7, "g", 234.33 },
	      new Object[] { 8, "h", 23.33 },
	    };
	  }
	
	
	@DataProvider
	  public Object[][] createcustomerdata() {
	    return new Object[][] {
	    	new Object[] { "ITA-TestNG-Cust5","ITA-TestNG-Cust5_Desc" },
	    	new Object[] { "ITA-TestNG-Cust6","ITA-TestNG-Cust6_Desc" },
	    	new Object[] { "ITA-TestNG-Cust7","ITA-TestNG-Cust7_Desc" },
	    	new Object[] { "ITA-TestNG-Cust8","ITA-TestNG-Cust8_Desc" }
	 
	    };
	}
	
	@DataProvider
	  public Object[][] createprojectdata() {
	    return new Object[][] {
	    	new Object[] { "Project1", "ITA-TestNG-Cust1","ITA-TestNG-Cust1_Desc" },
	    	new Object[] { "Project2", "ITA-TestNG-Cust2","ITA-TestNG-Cust2_Desc" },
	    	new Object[] { "Project3", "ITA-TestNG-Cust3","ITA-TestNG-Cust3_Desc" },
	    	new Object[] { "Project4", "ITA-TestNG-Cust4","ITA-TestNG-Cust4_Desc" },
	    	new Object[] { "Project5", "ITA-TestNG-Cust5","ITA-TestNG-Cust5_Desc" },
	    	new Object[] { "Project6", "ITA-TestNG-Cust6","ITA-TestNG-Cust6_Desc" },
	    	new Object[] { "Project7", "ITA-TestNG-Cust7","ITA-TestNG-Cust7_Desc" },
	    	new Object[] { "Project8", "ITA-TestNG-Cust8","ITA-TestNG-Cust8_Desc" },
	    };
	}
	
}
