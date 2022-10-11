package com.Saucedemo.TestClasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.POMClasses.LoginPagePOMClass;
import com.Saucedemo.Utilityclasses.Screenshotclass;


public class TC07_LogOutFunctionality extends TestBaseClass {
	
	
	@Test
	public void verifylogoutfunctionality() throws IOException
	{
		HomePagePOMclass hm=new HomePagePOMclass(driver);
	     hm.clicksmenubutton();
	     log.info("menu button click");
	     
	     Screenshotclass.takesreenshot(driver, "menubuttonpage");
	     hm.clicksignoutbutton();
	     log.info("sign out button click");
	    
	    Screenshotclass.takesreenshot(driver, "logoutpage");
	    
		String Expectedtitle="Swag Labs";
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		String actualtitle=lp.getitlefromloginpage();
		Assert.assertEquals(actualtitle, Expectedtitle);
		
		String ExpectedUrl="https://www.saucedemo.com/";
		String actualurl=lp.geturlfromloginpage();
		Assert.assertEquals(actualurl, ExpectedUrl);
	}
	  
	    
	    
	

}