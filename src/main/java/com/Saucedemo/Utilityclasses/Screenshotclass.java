 package com.Saucedemo.Utilityclasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotclass {
	
	public static void takesreenshot(WebDriver driver,String screenshotname) throws IOException
	{
		Date d=new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);

		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File selfile= ts.getScreenshotAs(OutputType.FILE);
		File myfile=new File("./ScreenShotsFolder\\"+screenshotname+date+".jpeg"); 
        FileHandler.copy(selfile, myfile);
	}

}
