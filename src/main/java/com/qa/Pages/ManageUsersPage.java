package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.WaitUtility;

public class ManageUsersPage extends Base
{

	 
	 @FindBy (xpath="//i[@class='nav-icon fas fa-user']")
	WebElement verifyUsers; 
	
	 @FindBy (xpath="//i[@class=' fa fa-search']")
	WebElement search1;  
	
	 @FindBy (id="un")
	 WebElement name;
	 
	 @FindBy (id="ut")
	 WebElement email;
	 
	 @FindBy (id="ph")
	 WebElement phone;
	 
	 @FindBy (id="st")
	 WebElement status;
	 
	 @FindBy (name="Search")
	 WebElement search2;
	 
	 @FindBy (xpath="//a[@class='btn btn-default btn-fix']")
	 WebElement resetbtn;
	 
	 @FindBy (xpath="//h1[@class='m-0 text-dark']")
	 WebElement textListUsers;
	 
	 @FindBy (id="res")
	 WebElement userFound;
	 
	 @FindBy (xpath="//i[@class='ace-icon fa fa-sync-alt']")
	 WebElement resetBtn;
	 
	 @FindBy (xpath="//i[@class='badge bg-success']")
	 WebElement actionBtn;
	 
	 @FindBy (xpath="//div[@class='alert alert-success alert-dismissible']")	
	 WebElement alertMsg;
	 
	public  ManageUsersPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	 }
	public boolean isPageOpened()
	 {
		 return textListUsers.getText().toString().contains("List Users");
	 }
	
	public void verifyUserClick()
	 {
		WaitUtility.visibilityOfEleLocated(driver, verifyUsers);
		 PageUtility.performClick(driver,verifyUsers );
		 
	 }
	
	public void clickOnVerifyUser()
	{
		WaitUtility.visibilityOfEleLocated(driver, verifyUsers);
		Actions action=new Actions(driver);
		action.moveToElement(verifyUsers).build().perform();
		search1.click();		
	}
		public void getDetailsForSearch(String giveName,String giveemail, String givenum)
	{
		PageUtility.performSendKey(driver, name, giveName);
		PageUtility.performSendKey(driver, email, giveemail);
		PageUtility.performSendKey(driver, phone,givenum );
		
	}
	public void status()
	 { 
		 WaitUtility.visibilityOfEleLocated(driver,status );
		 PageUtility.dropdown(status, "Inactive");
	 }	
	public void searchUserPage()
	{
		PageUtility.performClick(driver, search2);
	}
	public boolean isUserFound()
	{
		WaitUtility.visibilityOfEleLocated(driver,userFound );
		boolean isDisplayed=PageUtility.isElementDisplayed(userFound);
		return isDisplayed;	
	}
	
	
	public void clickOnReset()
	{
		WaitUtility.visibilityOfEleLocated(driver,resetBtn );
		PageUtility.performClick(driver, resetBtn);
	}
	
	
	public boolean clickOnAction()
	{
		WaitUtility.visibilityOfEleLocated(driver,actionBtn );
		PageUtility.performClick(driver, actionBtn);
		return true;		
	}
	
}
