package com.Saucedemo.TestClasses;
import java.io.IOException;

import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.Utilityclasses.Screenshotclass;

public class TC03_SelectProduct extends TestBaseClass {

	@Test
	public void selectproductfunctionality() throws IOException
	
	{
	HomePagePOMclass hm=new HomePagePOMclass(driver);
	
	hm.clicksaucebacg();
	Screenshotclass.takesreenshot(driver, "TC03selectProduct");
     log.info("sauce bag is open");
     log.info("We are able to select product");

}
//	https://www.saucedemo.com/inventory-item.html?id=4

	







}

