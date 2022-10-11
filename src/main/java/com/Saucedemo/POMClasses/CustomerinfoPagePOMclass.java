package com.Saucedemo.POMClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerinfoPagePOMclass {
	
	private WebDriver driver;
	
	@FindBy(id="first-name")
	private WebElement fname;
	
	public void sendfname()
	{
		fname.sendKeys("ram");
	}
	
	@FindBy(id="last-name")
	private WebElement lname;
	
	public void sendlname()
	{
		lname.sendKeys("krishna");
	}
	
	@FindBy(id="postal-code")
	private WebElement pincode;
	
	public void sendpincode()
	{
		pincode.sendKeys("123456");
	}
	

	@FindBy(id="continue")
	private WebElement cntn;
	
	public void clickcntnue()
	{
		cntn.click();
	}

	public CustomerinfoPagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

}
