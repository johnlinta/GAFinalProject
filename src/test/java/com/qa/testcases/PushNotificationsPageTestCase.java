package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.SignInPage;
import com.qa.base.Base;
import com.qa.Pages.PushNotificationsPage;

public class PushNotificationsPageTestCase extends Base
{
	SignInPage sp;
	PushNotificationsPage pp;
	

@BeforeClass
public void performLogin()
{
 pp=new PushNotificationsPage(driver);
 sp= new SignInPage(driver);
 
 sp.login("admin", "admin");
}

	
    @Test(priority=1)
    public void testPushNotiPage()
    {
    	pp.testPage();
    	boolean verifyPushNotificationPage=pp.testPage();
		Assert.assertTrue(verifyPushNotificationPage);
    }
	@Test(priority=2)
	public void verifyPushNotificationPage()
	{
		pp.testPushNotificationPage();
		String expected="https://groceryapp.uniqassosiates.com/admin/Notification/add";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected, "titles are  same");
	}
	
	@Test(priority=3)
	public void verifyAlert()
	{
		
		Assert.assertTrue(pp.testAlert());
	}
	@Test(priority=4)
	public void verifyTestReset() 
	{
		pp.testReset();
		String expected="https://groceryapp.uniqassosiates.com/admin/list-notifications";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected, "titles are  same");
	} 
}
