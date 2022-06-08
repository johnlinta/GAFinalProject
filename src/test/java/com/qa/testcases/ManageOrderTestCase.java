package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.ManageOrderPage;
import com.qa.Pages.SignInPage;
import com.qa.base.Base;

public class ManageOrderTestCase extends Base
{
ManageOrderPage hp;
SignInPage sp;


@BeforeClass
public void performLogin()
{
 hp= new ManageOrderPage(driver);
 sp= new SignInPage(driver);
 
 sp.login("admin", "admin");
}


@Test(priority=1)
public void manageOrderPage()
{
	hp.manageOrderClick();
}

@Test(priority=2)
public void listOrderIsDisplayed()
{
boolean listOrderIsDisplayed=hp.isPageOpened();
Assert.assertTrue(listOrderIsDisplayed);
}

@Test(priority=3)
public void verifyHomePageTitel()
{
	String homepageTitle= hp.homePageTitle();
	Assert.assertEquals(homepageTitle,"List Orders | 7rmart supermarket");
}

@Test(priority=4)
public void searchManageOrderPage()
{
	hp.searchManageOrder();
}

@Test(priority=5)
public void orderIdManageOrderPage()
{
	hp.orderIdManageOrder();
}

@Test(priority=6)
public void paymentmodeManageOrderPage()
{
	hp.paymentModeManageOrder();
}

@Test(priority=7)
public void statusManageOrderPage()
{
	hp.statusManageOrder();
}

@Test(priority=8)
public void searchOrderIdManageOrderPage()
{
	hp.searchOrderidManageOrder();
}

@AfterClass
public void close()
{
	sp= new SignInPage(driver);
	sp.logout();
}

/*@AfterClass

public void performLogout()
{
	sp= new SignInPage(driver);
	 sp.logout(); 
}  */
}





