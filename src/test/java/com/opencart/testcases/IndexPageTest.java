package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.IndexPage;

public class IndexPageTest	extends BaseClass {
	IndexPage index;
	
	IndexPageTest()
	{
	
		super();
		index = new IndexPage();
	}
	@BeforeMethod
	public void setUp()
	{
		initalization();
		index=new IndexPage();
	}
	
	
			@Test(priority=1)
			public void LogoTest() {
			
		
				Assert.assertTrue(index.indexPageTitleDisplayed());
			}
			
			@Test(priority=2)
			public void titleTest()
			{
				Assert.assertEquals("Your Store", index.indexPageTitleName());
				//System.out.println(index.indexPageTitleName());
			}
			
			@Test(priority=3)
			public void currencyDropDown()
			{
				
				Assert.assertEquals(index.currencyDropDownisDisplayed(), true);
			}
			
			@Test(priority=4)
			public void doller()
			{
				System.out.println(index.currncyDoller());
			}
			@Test(priority=5)
			
			public void dropDownLinkValidation()
			{
				
				Assert.assertTrue(index.currencyDropDownisDisplayed());
			}
			
			@Test(priority=6)
			public void loginPageNavigation()
			{
				System.out.println( index.getLoginPage());
			}
			
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
			
			
			
			
			
			
}
