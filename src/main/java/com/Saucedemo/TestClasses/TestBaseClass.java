package com.Saucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucedemo.POMClasses.LoginPagePOMClass;

public class TestBaseClass {
	
	public WebDriver driver;
	Logger log=Logger.getLogger("SauceDemoProject1");
	
	@Parameters("browsername")
	@BeforeMethod
	public void setUP(String browsername) throws IOException
	{
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"./DriverFiles\\chromedriver.exe"); 
		
		 driver=new ChromeDriver();}
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"./DriverFiles\\geckodriver.exe");
			
		 driver=new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		log.info("Browser open");
		
		driver.get("https://www.saucedemo.com/");
		log.info("Saucedemo website is open");
		
		driver.manage().window().maximize();
		log.info("maximize the window");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		lp.sendusername();
		log.info("username send");
		
		lp.sendpassword();
		log.info("password send");
		
		lp.clickloginbutton();
		log.info("click on login button");	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		log.info("close Browser");
		log.info("End of Program");
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
