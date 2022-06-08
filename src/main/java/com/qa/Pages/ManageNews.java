
package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.WaitUtility;


public class ManageNews extends Base
{
	
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-edit']")
	WebElement managecontent;
	
	
	@FindBy(xpath="//p[text()='Manage News']")
	WebElement managenews;
	
	@FindBy(xpath="	//a[@class='btn btn-rounded btn-danger']")
	WebElement newbtn;
	
	
	
	@FindBy(id="news")
	WebElement news;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement save;
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchBtn;
	
	@FindBy(name="un")
	WebElement searchNews;
	
	@FindBy(name="Search")
	WebElement submit2;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetBtn;
	
public ManageNews(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void newBtn() 
{
	WaitUtility.visibilityOfEleLocated(driver,managecontent );
	 PageUtility.performClick(driver,managecontent);
	 WaitUtility.visibilityOfEleLocated(driver,managenews );
	 PageUtility.performClick(driver,managenews);
	 WaitUtility.visibilityOfEleLocated(driver,newbtn );
	 PageUtility.performClick(driver,newbtn);
	 WaitUtility.visibilityOfEleLocated(driver,news );
	 PageUtility.performSendKey(driver,news,"cart items expired");
	//elementUtil.isdisplayed(save);
	 WaitUtility.visibilityOfEleLocated(driver,save );
	 PageUtility.performClick(driver,save);

	
}
public boolean newBtnAlert() 
{
	
	WaitUtility.visibilityOfEleLocated(driver, alert);
	boolean isDisplayed=PageUtility.isElementDisplayed(alert);
	return isDisplayed;
	
}
public void searchBtn()
{
	driver.get("https://groceryapp.uniqassosiates.com/admin/list-news");
	WaitUtility.visibilityOfEleLocated(driver,searchBtn );
	 PageUtility.performClick(driver,searchBtn);
	 WaitUtility.visibilityOfEleLocated(driver,searchNews );
	 PageUtility.performSendKey(driver,searchNews, "cart items expired");
	 WaitUtility.visibilityOfEleLocated(driver,submit2 );
	 PageUtility.performClick(driver,submit2);
	
	}
public void resetBtn() 
{
	WaitUtility.visibilityOfEleLocated(driver,resetBtn );
	 PageUtility.performClick(driver,resetBtn);
}
}


