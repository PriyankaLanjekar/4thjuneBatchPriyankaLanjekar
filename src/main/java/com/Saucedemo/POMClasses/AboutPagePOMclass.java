package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutPagePOMclass {
	private WebDriver driver;
	
	public AboutPagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	
	public String getitlefromaboutnpage()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String geturlfromaboutpage()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	
	
	
	
	
	
	
	
	
	
}
