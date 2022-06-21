package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Pages.SignInPage;
import com.qa.Pages.ManageUsersPage;
import com.qa.base.Base;

public class ManageUsersTestCase extends Base
{
	
	SignInPage sp;
	ManageUsersPage vu;
	 
	@BeforeClass
	public void performLogin()
	{
	 vu= new ManageUsersPage(driver);
	 sp= new SignInPage(driver);
	 sp.login("admin", "admin");
	}


	@Test(priority=1)
	public void manageVerifyUsersPage()
	{
		vu.verifyUserClick();
		vu.isPageOpened();
		Assert.assertTrue(vu.isPageOpened());
	}
	
	

   @Test(priority=2)
   public void searchVerifyUsersPage()

   {  
	vu.verifyUserClick();
	vu.clickOnVerifyUser();  
	vu.getDetailsForSearch("Akhil", "akhildas710@gmail.com","9513318407");   
	vu.status();
	vu.searchUserPage();
	boolean searchVerifyUsersPage=vu.isUserFound();
	Assert.assertTrue(searchVerifyUsersPage);
   }
   
   
   
   
   @Test(priority=3)
   public void verifyStatus()
   {
	   vu.clickOnReset();
	   String expected="https://groceryapp.uniqassosiates.com/admin/list-user";	   
	   String actual=driver.getCurrentUrl();
	   Assert.assertEquals(actual, expected,"titles are same");	   
   }
	
   
 /* @Test(priority=4)	  
	   public void verifyAction()
	   {
		  vu.clickOnAction();
		  boolean verifyAction=vu.clickOnAction();
		  Assert.assertTrue(verifyAction); 
	   }
*/
   
   
   }
