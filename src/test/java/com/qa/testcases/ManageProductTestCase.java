package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.ManageProductPage;
import com.qa.Pages.SignInPage;
import com.qa.base.Base;

public class ManageProductTestCase extends Base
{
	ManageProductPage mp;
	SignInPage sp;


	@BeforeClass
	public void performLogin()
	{
	 mp= new ManageProductPage(driver);
	 sp= new SignInPage(driver);
	 
	 sp.login("admin", "admin");
	}

@Test(priority=1)

public void verifyManageProduct()
{
	mp.clickOnManageProduct();
	mp.isPageOpened();
	Assert.assertTrue(mp.isPageOpened());
}


@Test(priority=2)
public void  verifyManageProductPage()
{
	mp.testManageProductPage();	
}  

@Test(priority=3)
public void verifySearchBtn()
{
	mp.testSearchBtn();
	mp.isUserFound();
	boolean verifySearchBtn=mp.isUserFound();
	Assert.assertTrue(verifySearchBtn);
}

/*@Test(priority=4)
public void verifyResetBtn()
{
	mp.testResetBtn();
	boolean verifyResetBtn=mp.testResetBtn();
	Assert.assertTrue(verifyResetBtn);
}  */
}



