package com.qa.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.WaitUtility;


public class PushNotificationsPage extends Base

{
	
	@FindBy(xpath="//p[text()='Push Notifications']")
	WebElement pushnotifctn;

	
	@FindBy(id="title")
	WebElement title;
	
	@FindBy(id="description")
	WebElement descptn;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement send;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
	
	@FindBy(xpath="//a[text()='Reset']")
	WebElement reset;
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
	WebElement textPushNoti;
	
	public PushNotificationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public boolean testPage()
	{
		WaitUtility.visibilityOfEleLocated(driver,pushnotifctn );
		 PageUtility.performClick(driver,pushnotifctn);
		return textPushNoti.getText().toString().contains("Push Notifications");
	}
	public void testPushNotificationPage() 
	{
		WaitUtility.visibilityOfEleLocated(driver,pushnotifctn );
		 PageUtility.performClick(driver,pushnotifctn);
		WaitUtility.visibilityOfEleLocated(driver,pushnotifctn );
		 PageUtility.performClick(driver,pushnotifctn);
		 WaitUtility.visibilityOfEleLocated(driver,title );
		 PageUtility.performSendKey(driver,title, "ORDER STATUS");
		 WaitUtility.visibilityOfEleLocated(driver,descptn );
		 PageUtility.performSendKey(driver,descptn, "your is delivered");
		 WaitUtility.visibilityOfEleLocated(driver, send );
		 PageUtility.performClick(driver,send);
	}
	public boolean testAlert() 
	{
		WaitUtility.visibilityOfEleLocated(driver, alert);
		boolean isDisplayed=PageUtility.isElementDisplayed(alert);
		return isDisplayed;
		
	}

	public void testReset()
	{
		PageUtility.performClick(driver,reset);
	}
	
}

