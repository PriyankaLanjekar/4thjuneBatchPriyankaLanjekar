package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiipagePOMclass {

	private WebDriver driver;
	
	
	public  BiipagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	public void clickfinishbutton()
	{
		finish.click();
	}
	
	public String getitlefrombillpage()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String geturlfrombillpage()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	
	
	
	
	
	
}
