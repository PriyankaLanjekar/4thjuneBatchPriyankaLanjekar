package com.Saucedemo.TestClasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.ChekOutPagePOMclass;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.Utilityclasses.Screenshotclass;
  
public class TC05_BuyTheProduct extends TestBaseClass{
	
	
	@Test
	public void Buytheproductfunctionality() throws IOException
	{
	HomePagePOMclass hm=new HomePagePOMclass(driver);
	
	hm.clicksaucebagitem();
	log.info("add to cart the product");
	
	hm.clickaddtocart();
	log.info("product added to cart");
	Screenshotclass.takesreenshot(driver, "productaddtocart05");
	ChekOutPagePOMclass ck=new ChekOutPagePOMclass(driver);
    
	String Expectedtitle="Swag Labs";
	String actualtitle=ck.getitlefromchekoutpage();
	Assert.assertEquals(actualtitle, Expectedtitle);
	
	String ExpectedUrl="https://www.saucedemo.com/cart.html";
	String actualurl=ck.geturlfromchekoupage();
	Assert.assertEquals(actualurl, ExpectedUrl);
	ck.clickcheckout();
	log.info("click on checkout");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

