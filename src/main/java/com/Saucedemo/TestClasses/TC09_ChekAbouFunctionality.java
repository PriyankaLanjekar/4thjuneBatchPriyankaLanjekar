package com.Saucedemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Saucedemo.POMClasses.AboutPagePOMclass;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.Utilityclasses.Screenshotclass;

public class TC09_ChekAbouFunctionality extends TestBaseClass {

		@Test
		public void verifycheckoutfunctionality() throws IOException
		{
		HomePagePOMclass hm=new HomePagePOMclass(driver);
	     hm.clicksmenubutton();
	     log.info("menu button click");
	
	     hm.clickaboutbutton();
	     log.info("click on about button");
	 	 
	 	Screenshotclass.takesreenshot(driver, "aboutpage");
	 	
	 	AboutPagePOMclass ab=new AboutPagePOMclass(driver);
			String Expectedtitle="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
			String actualtitle=ab.getitlefromaboutnpage();
	
			Assert.assertEquals(actualtitle, Expectedtitle);
			
			String ExpectedUrl="https://saucelabs.com/";
			String actualurl=ab.geturlfromaboutpage();
			Assert.assertEquals(actualurl, ExpectedUrl);
		}
		
			
	     
	
}

