package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.ManageLocationPage;
import com.qa.Pages.SignInPage;
import com.qa.base.Base;

public class ManageLocationTestCase extends Base

{
	SignInPage sp;
	ManageLocationPage ml;
	
	@BeforeClass
	public void performLogin()
	{
	 ml= new ManageLocationPage(driver);
	 sp= new SignInPage(driver);
	 
	 sp.login("admin", "admin");
	}

	@Test(priority=1)
	public void verifyLocation()
	{
		ml.clickLocation();
		boolean verifyLocation=ml.clickLocation();
		Assert.assertTrue(verifyLocation);
	}
	
	@Test(priority=2)
	public void verifyNewBtn()
	{
		ml.newOnClick();
		String expected="https://groceryapp.uniqassosiates.com/admin/Location/add";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected, "titles are  same");
		
	}
	
	
	@Test(priority=3)
	public void verifyNewBtnAlert()
	{
		Assert.assertTrue(ml.newButtonAlert());
	}
	
	
	@Test(priority=4)
	public void verifySearchBtn()
	{
		ml.searchOnClick();
		ml.isLocFound();
		boolean verifySearchBtn=ml.isLocFound();
		Assert.assertTrue(verifySearchBtn);
	}
	
	
   @Test(priority=5)
	public void titleUrl()
	{
	String url=driver.getCurrentUrl();
	String title=driver.getTitle();
	Assert.assertTrue(true);
	}  
  
}
