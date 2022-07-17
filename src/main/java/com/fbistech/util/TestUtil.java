package com.fbistech.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.fbistech.base.TestBase; 

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICITY_WAIT = 10;
	

	 
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
	
	
	
	
/*	THIS IS DATA DRIVEN FRAME WORK APPROACH 
 	inside ContactsPageTest class contains other codes
*/
	public static String TESTDATA_SHEET_PATH = "/Users/josephajayi/eclipse-workspace/BeamSity_Website/src/main/"
			+ "java/com/fbistech/testdata/TestData.xlsx"; //this is location for the excel testdata sheet
	
	static Workbook book; 
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	
/*	this method-> Object[][] getTestData() is returning one two dimension object array 
  	the sheetName  will iterate the sheet on the bases of rows and columns that 
  	is why 2 for loop is created. One is for Row and other is for column 
  	
*/
	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException
	{
		FileInputStream file = null;
		
		try
		{
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			book = WorkbookFactory.create(file);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetName);
		
/*		The data type of this array is 2 dimension object array which is call 2 for-loop
 		One of the for loop is for row and the other for column
 		Row by row and column by column it will take the value and store it in the object array name ->(data) and return the array (data)

*/
		Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		System.out.println(sheet.getLastRowNum() + "......." + sheet.getRow(0).getLastCellNum());	
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) //<-- for  rows 
		{
			for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) //<-- for columns
			{
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//				System.out.println(data[i][k]);
			}
		}
		
		return data;	
	} 
	
/* 	This method is taking screen shot, chec k WebEventListener Class line 77
 	The screen shot folder will be created automatically 	
*/	public static void takeScreenshotAtEndOfTest()throws IOException
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		{
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		}
		
	}
	
	
}
 