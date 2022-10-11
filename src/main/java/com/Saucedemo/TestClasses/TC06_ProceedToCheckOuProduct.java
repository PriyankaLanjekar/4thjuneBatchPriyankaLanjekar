package com.Saucedemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.BiipagePOMclass;
import com.Saucedemo.POMClasses.ChekOutPagePOMclass;
import com.Saucedemo.POMClasses.CustomerinfoPagePOMclass;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.Utilityclasses.Screenshotclass;


public class TC06_ProceedToCheckOuProduct extends TestBaseClass {
	
	@Test
	public void verifyproceedtobuyfunctionality() throws IOException
	{
		HomePagePOMclass hm=new HomePagePOMclass(driver);
		
		hm.clicksaucebagitem();
		log.info("add to cart the product");
		Screenshotclass.takesreenshot(driver, "addtocartproduct");
		
		hm.clickaddtocart();
		log.info("product added to cart");
		
		ChekOutPagePOMclass ck=new ChekOutPagePOMclass(driver);
		ck.clickcheckout();
		Screenshotclass.takesreenshot(driver, "checkoutpage");
		log.info("click on checkout");
		
		CustomerinfoPagePOMclass ci=new CustomerinfoPagePOMclass(driver);
		ci.sendfname();
		ci.sendlname();
		ci.sendpincode();
		log.info("first name,last name and pin code is added");
		Screenshotclass.takesreenshot(driver, "customerinfoadded");
		ci.clickcntnue();
		log.info("click on continue button");
		
		BiipagePOMclass  bi=new BiipagePOMclass(driver);
		bi.clickfinishbutton();
		System.out.println("We buy the product");
		Screenshotclass.takesreenshot(driver, "buyproductlastpage");
		
		String Expectedtitle="Swag Labs";
		String actualtitle=bi.getitlefrombillpage();
		Assert.assertEquals(actualtitle, Expectedtitle);
		
		String ExpectedUrl="https://www.saucedemo.com/checkout-complete.html";
		String actualurl=bi.geturlfrombillpage();
		Assert.assertEquals(actualurl, ExpectedUrl);
	}
	
	
		
	

}
