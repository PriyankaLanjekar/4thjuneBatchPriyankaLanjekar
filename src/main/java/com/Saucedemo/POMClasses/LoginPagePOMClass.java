package com.Saucedemo.POMClasses;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass {
	//steps to follow
	//1.declare driver
	//2.find element by @FindBy annotation
	//3.create methods for elements action
	//4.create constroctor
	private WebDriver driver;
	@FindBy(id="user-name")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(id="password")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String getitlefromloginpage()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String geturlfromloginpage()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	

	@FindBy(xpath="//div[@class='error-message-container error']")
	private WebElement Errormessage;
	
	public Boolean errormessageenabled()
	{
		
		Boolean value=Errormessage.isDisplayed();
		return value;
	}
	
	
	
	
	
	
}
