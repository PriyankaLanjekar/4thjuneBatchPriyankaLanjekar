package com.Saucedemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.Utilityclasses.Screenshotclass;

public class TC04_AddProductToCart extends TestBaseClass{

@Test
public void addtoproductfunctionality() throws IOException
{
	HomePagePOMclass hm=new HomePagePOMclass(driver);
	
	hm.clicksaucebagitem();
	log.info("add to cart the product");
	Screenshotclass.takesreenshot(driver, "TC_04addtocart");
	String expected=hm.gettextfromaddtocart();
	String given="1";
	Assert.assertEquals(given, expected);
}


	
	
	
	
	
}

