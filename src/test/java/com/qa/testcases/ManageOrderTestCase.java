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

@Test(priority=2)
public void verifyHomePageTitel()
{
	String homepageTitle= hp.homePageTitle();
	Assert.assertEquals(homepageTitle,"List Orders | 7rmart supermarket");
}

@Test(priority=1)
public void listOrderIsDisplayed()
{
	hp.manageOrderClick();
boolean listOrderIsDisplayed=hp.manageOrderClick();
Assert.assertTrue(listOrderIsDisplayed);
}

@Test(priority=3)
public void searchManageOrderPage()
{
	hp.searchManageOrder();
	boolean searchVerifyUsersPage=hp.isUserFound();
	Assert.assertTrue(searchVerifyUsersPage);
}

@Test(priority=4)
public void verifyReset()
{
	hp.clickOnReset();
	String expected="https://groceryapp.uniqassosiates.com/admin/list-order";	   
    String actual=driver.getCurrentUrl();
    Assert.assertEquals(actual, expected,"titles are same");	   
}


@Test(priority=5)
public void verifyView()
{
	hp.view();
	boolean verifyView=hp.clickOrderDetails();
	Assert.assertTrue(verifyView);

}


}

