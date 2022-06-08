package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.ScreenshotsUtil;
import com.qa.utility.WaitUtility;

public class SignInPage extends Base
{
	
	@FindBy(name="username")
	WebElement userid;
  
  @FindBy(name="password")
  WebElement pass;
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement loginbutton;
  
  @FindBy(xpath="//a[@data-toggle='dropdown']")
  WebElement Admin; 
  
  
  @FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")
  WebElement logout;
  
  public SignInPage(WebDriver driver)
  {
	// TODO Auto-generated constructor stub
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  public boolean isUserIdFieldDisplayed()
  {
	  WaitUtility.visibilityOfEleLocated(driver, userid);
	  
	  boolean isDisplayed=PageUtility.isElementDisplayed(userid);
	return isDisplayed;
	  
  }
  
  public boolean isPasswordFieldDisplayed()
  {
	  WaitUtility.visibilityOfEleLocated(driver, pass);
	  
	  boolean isDisplayed=PageUtility.isElementDisplayed(pass);
	return isDisplayed;
	  
  }
  
  public boolean isMasked()
  {
	  boolean masked=false;
	 

	  if(pass.getAttribute("type").equals("pass"))
	  {
		  masked=true;
	  }
	return masked;
	  
  }
  public void login(String username, String password)
  {
	PageUtility.performSendKey(driver,userid, username);  
	PageUtility.performSendKey(driver, pass, password);  
	PageUtility.performClick(driver, loginbutton);
	
	loginScreenshot();
  }
  
  public void loginScreenshot()
  {
	  ScreenshotsUtil.screenshot(driver,"login");
	
}


public void logout()
  {
	  
	  WaitUtility.visibilityOfEleLocated(driver, Admin);
	  PageUtility.performClick(driver, Admin);
	  PageUtility.performClick(driver, logout);
	  
  }
     
}


