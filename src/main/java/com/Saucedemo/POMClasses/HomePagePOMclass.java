package com.Saucedemo.POMClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMclass {
	
	private WebDriver driver;
	
	@FindBy (className="inventory_item_name")
	private WebElement saucebacg;
	
	public void clicksaucebacg()
	{
		saucebacg.click();		
	}
	
	@FindBy (id="add-to-cart-sauce-labs-backpack")
	private WebElement saucebagitem;
	
	
	public void clicksaucebagitem()
	{
		saucebagitem.click();
	}
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	WebElement addtocart;
	
	public void clickaddtocart()
	{
		addtocart.click();
	}
	
	public String gettextfromaddtocart()
	{
		String s=addtocart.getText();
		return s;
	}

	
	public HomePagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		s=new Select(filter);
	}
	
	
	@FindBy (id="logout_sidebar_link")
	private WebElement signout;
	
	
	public void clicksignoutbutton()
	{
		signout.click();
	}
	
	@FindBy (id="react-burger-menu-btn")
	private WebElement menu;
	
	
	public void clicksmenubutton()
	{
		menu.click();
	}

	
	public String getitlefromhomepage()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String geturlfromhomepage()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	@FindBy (xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	public void clickonfilter()
	{
		filter.click();
	}
	
	Select s;
	
	public void filteapply(int x)
	{ 
		s.selectByIndex(x);
	}
	
	@FindBy (xpath="(//div[@class='inventory_item'])[1]")
	private WebElement firststelementafterfilter;
	
	public String getTextfrom1stelement()
	{ 
		String tx=firststelementafterfilter.getText().substring(0, 32);
		return tx;
	}
	
	public String getTextfrom1stelement1()
	{ 
		String r=firststelementafterfilter.getText().substring(0, 17);
		return r;
	}
	
	

	
	@FindBy (id="about_sidebar_link")
	private WebElement about;
	public void clickaboutbutton()
	{
		about.click();
	}

//	private List<WebElement> allproducttitle;
//	public List<String> Gettextofallprod()
//	{
//		List<String> acttitles=new ArrayList<String>();
//		for(WebElement i:allproducttitle)
//		{
//			acttitles.add(i.getText());
//		}
//		return acttitles;
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
