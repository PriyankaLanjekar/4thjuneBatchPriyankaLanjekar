package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChekOutPagePOMclass {
	private WebDriver driver;
	

	@FindBy (xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	public void clickcheckout()
	{
		checkout.click();
	}
	

	public ChekOutPagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String getitlefromchekoutpage()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String geturlfromchekoupage()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	
	
	
	
	
}
