package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.WaitUtility;

public class ManageOrderPage extends Base
{
	
 @FindBy (xpath="//i[@class='nav-icon fas fa-shopping-basket']")
 WebElement manageOrders;
 
 @FindBy (xpath="//i[@class=' fa fa-search']")
 WebElement search;
 
 @FindBy (id="od")
 WebElement orderId; 

 @FindBy (name="Search")
 WebElement searchOrderid;
 
 @FindBy (name="pt")
 WebElement paymentMode;
 
 @FindBy (name="st")
 WebElement status;
 
 @FindBy (xpath="//h1[@class='m-0 text-dark']")
 WebElement textListOrders;
 
 public  ManageOrderPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	
 }
 

 public String homePageTitle()
 {
	return driver.getTitle();
	 
 }
 public void manageOrderClick()
 {
	 WaitUtility.visibilityOfEleLocated(driver,manageOrders );
	 PageUtility.performClick(driver, manageOrders);
	 
 }
 
 public void searchManageOrder()
 {
	 WaitUtility.visibilityOfEleLocated(driver,search );
	 PageUtility.performClick(driver, search);
	 //search.click();
 }
 
 public boolean isPageOpened()
 {
	 return textListOrders.getText().toString().contains("List Orders");
 }
 
 public void orderIdManageOrder()
 {
	 WaitUtility.visibilityOfEleLocated(driver,orderId );
	 PageUtility.performClick(driver, orderId);
	 PageUtility.performSendKey(driver, orderId, "580");
 }
 
 public void paymentModeManageOrder()
 { 
	 WaitUtility.visibilityOfEleLocated(driver,paymentMode );
	 PageUtility.dropdown(paymentMode, "Bank");
 }
 
 public void statusManageOrder()
 { 
	 WaitUtility.visibilityOfEleLocated(driver,status);
	 PageUtility.dropdown(status, "Out For Delivery");
 }
 
 public void searchOrderidManageOrder()
 {
	 WaitUtility.visibilityOfEleLocated(driver,searchOrderid );
	 PageUtility.performClick(driver, searchOrderid);
 }

}



