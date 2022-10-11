package com.Saucedemo.TestClasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.LoginPagePOMClass;
import com.Saucedemo.Utilityclasses.Screenshotclass;

public class TC02_LoginfunctionalityNegativeWay extends TestBaseClass {
	
	
		@Test
//		(dependsOnMethods= {"setUP"})
		public void verifyloginnegativefunctionality() throws IOException
		{
			LoginPagePOMClass lp=new LoginPagePOMClass(driver);
			
			Screenshotclass.takesreenshot(driver, "TC_02negativelogin");
			String Expectedtitle="Swag Labs";
			String actualtitle=lp.getitlefromloginpage();
			Assert.assertEquals(actualtitle, Expectedtitle);
			
			String ExpectedUrl="https://www.saucedemo.com/";
			String actualurl=lp.geturlfromloginpage();
			Assert.assertEquals(actualurl, ExpectedUrl);
			
			
			
	
			
//		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
//		Boolean b=lp.errormessageenabled();
//		if(b==true)
//		{
//		System.out.println("error msg shows");
//		System.out.println("Our test case is pass");
//		}
//		else
//			{
//			System.out.println("error msg not shows");
//		     System.out.println("Our test case is fail");
//			}
		
	}
	
		
		
		
		
		

}
