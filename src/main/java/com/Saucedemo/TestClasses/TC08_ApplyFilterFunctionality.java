package com.Saucedemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Saucedemo.POMClasses.HomePagePOMclass;
import com.Saucedemo.Utilityclasses.Screenshotclass;

public class TC08_ApplyFilterFunctionality  extends TestBaseClass{
	
@Test
public void verifyApplyfilterfunctionality() throws IOException, InterruptedException
{
		HomePagePOMclass hm=new HomePagePOMclass(driver);
		hm.clickonfilter();
		log.info("click on filter");
		
//		hm.filteapply(1);
//		String actualtext=hm.getTextfrom1stelement();
//
//		String Expectedtext= "Test.allTheThings() T-Shirt (Red)";
//		Assert.assertEquals(actualtext, Expectedtext);
	
//		Screenshotclass.takesreenshot(driver, "filterfromA-Z");

		
		hm.filteapply(2);
		
		String actualtext1=hm.getTextfrom1stelement1();

		String Expectedtext1= "Sauce Labs Onesie";
		Assert.assertEquals(actualtext1, Expectedtext1);
//		if(Expectedtext1.equals(actualtext1)==true)
//			System.out.println("filter  applied for low to High");
//		else
//			System.out.println("filter not applied for low to High");
		
		Screenshotclass.takesreenshot(driver, "filterfromA-Z");
//		Sauce Labs Backpack ->0
//		Test.allTheThings() T-Shirt (Red)-->1
//		Sauce Labs Onesie -->2
//		Sauce Labs Fleece Jacket  -->3
		Screenshotclass.takesreenshot(driver, "filterfromLow-High");
		log.info("we apply filter");
		
}
		
}

