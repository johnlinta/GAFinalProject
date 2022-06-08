package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.ExpenseCategoryPage;
import com.qa.Pages.SignInPage;
import com.qa.base.Base;

public class ExpenseCategoryTestCase extends Base
{
	SignInPage sp;
	ExpenseCategoryPage ec;
		

@BeforeClass
public void performLogin()
{
 ec=new ExpenseCategoryPage(driver);
 sp= new SignInPage(driver);
 
 sp.login("admin", "admin");
}

		
	@Test(priority=1)
	public void expenseCategoryPageVerification()
	{
		ec.ExpenseCategoryPageAction();
		
	}
	
	@Test(priority=2)
	public void verifyExpenseCategoryPageNewButtonElement()
	{
		ec.expenseCategoryPageNewButtonElement();
		Assert.assertTrue(ec.expenseCategoryPageNewButtonElement());
	}
	
	@Test(priority=3)
	public void verifyExpenseCategoryPageSearchButtonElement()
	{
		ec.expenseCategoryPageSearchButtonElement();
		Assert.assertTrue(ec.expenseCategoryPageSearchButtonElement());
		
		
	}

	@AfterClass
	public void close()
	{
		sp= new SignInPage(driver);
		sp.logout();
	}
}
