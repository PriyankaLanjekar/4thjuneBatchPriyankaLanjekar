package com.Saucedemo.TestClasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.Utilityclasses.Screenshotclass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass {
	

		@Test
	public void loginfuctionality() throws IOException
	{	 
			Screenshotclass.takesreenshot(driver, "LoginPageTC_01");
		HomePagePOMclass hm=new HomePagePOMclass(driver);
		String Expectedtitle="Swag Labs";
		String actualtitle=hm.getitlefromhomepage();
		Assert.assertEquals(actualtitle, Expectedtitle);
		
	
		String ExpectedUrl="https://www.saucedemo.com/inventory.html";
		String actualurl=hm.geturlfromhomepage();
		Assert.assertEquals(actualurl, ExpectedUrl);
	}
	
		
		
		
		
}
