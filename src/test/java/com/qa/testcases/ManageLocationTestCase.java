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
	public void verifyNewBtn()
	{
		ml.newOnClick();
	}
	
	
	
	@Test(priority=2)
	public void verifyNewBtnAlert()
	{
		Assert.assertTrue(ml.newButtonAlert());
	}
	
	
	@Test(priority=3)
	public void verifySearchBtn()
	{
		ml.searchOnClick();

	}
	
	
   @Test(priority=4)
	public void titleUrl()
	{
	String url=driver.getCurrentUrl();
	String title=driver.getTitle();
	Assert.assertTrue(true);
	}
   @AfterClass
	public void close()
	{
	   sp= new SignInPage(driver);
		sp.logout();
	}
}
