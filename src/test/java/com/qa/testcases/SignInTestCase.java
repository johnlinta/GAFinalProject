package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.SignInPage;
import com.qa.base.Base;
import com.qa.utility.ScreenshotsUtil;

public class SignInTestCase extends Base
{
	SignInPage sp;
	
@BeforeClass
	public void beforeMethod()
	{
	 sp= new SignInPage(driver);	
	}

	@Test(priority=4)
	
	public void login()
	{
		sp.login("admin", "admin");
		String methodname=new Object() {}
        .getClass()
        .getEnclosingMethod()
        .getName();

        ScreenshotsUtil.screenshot(driver,methodname);

	}
	
	@Test(priority=1)

	public void userIdFeildIsDisplayed()
	{
		 boolean userIdFeildIsDisplayed=sp.isUserIdFieldDisplayed();
		 Assert.assertTrue(userIdFeildIsDisplayed);
		
	}

	@Test(priority=2)

	public void passwordFeildIsDisplayed()
	{
		 boolean passwordFeildIsDisplayed=sp.isPasswordFieldDisplayed();
		 Assert.assertTrue(passwordFeildIsDisplayed);
		
	}
	
	@Test(priority=3)
	public void passwordMasked()
	{
		boolean passwordMasked=sp.isMasked();
		Assert.assertTrue(passwordMasked);
	} 
	
	
	
	
   @AfterClass
	public void close()
	{
		sp.logout();
		
	}
}


