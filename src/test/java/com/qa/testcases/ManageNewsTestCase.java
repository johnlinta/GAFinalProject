package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.ManageNews;
import com.qa.Pages.SignInPage;
import com.qa.base.Base;

public class ManageNewsTestCase extends Base
{
	ManageNews mn;
	SignInPage sp;
	
	@BeforeClass
	public void performLogin()
	{
	 mn=new ManageNews(driver);
	 sp= new SignInPage(driver);
	 
	 sp.login("admin", "admin");
	}

	
	@Test(priority=1)
	public void verifyNewBtn() {
		mn.newBtn();
		
	}
	@Test(priority=2)
	public void verifyNewBtnAssert() 
	{
		mn.newBtnAlert();
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	public void verifysearchBtn()
	{
		mn.searchBtn();
	String actual="https://groceryapp.uniqassosiates.com/admin/news/index";
	String expected=driver.getCurrentUrl();
	Assert.assertEquals(actual, expected,"titles are not similar");
	}
	@Test(priority=4)
	public void verifyResetBtn() 
	{
		mn.resetBtn();
		String actual="https://groceryapp.uniqassosiates.com/admin/list-news";
		String expected=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected,"urls are different");
	}
	
	@AfterClass
	public void close()
	{
		sp= new SignInPage(driver);
		sp.logout();
	}
}