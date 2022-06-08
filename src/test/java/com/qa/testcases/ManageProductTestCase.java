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

public void manageProductPage()
{
	mp.testManageProductPage();
}

@Test(priority=2)
public void testSearchBtn()
{
	mp.testSearchBtn();
//	Assert.assertTrue(true);
}

@AfterClass
public void close()
{
	sp= new SignInPage(driver);
	sp.logout();
}
}



