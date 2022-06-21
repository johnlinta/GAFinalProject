package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.WaitUtility;

public class ManageLocationPage extends Base
{

@FindBy (xpath="//p[text()='Manage Location']")
WebElement manageLocation;

@FindBy (xpath="//a[@class='btn btn-rounded btn-danger']")
WebElement newButton;

@FindBy (id="country_id")
WebElement country1;

@FindBy (id="st_id")
WebElement state1;

@FindBy (id="location")
WebElement location1;


@FindBy (id="delivery")
WebElement delivery;

@FindBy (name="create")
WebElement saveButton;

@FindBy (xpath="//div[@class='alert alert-success alert-dismissible']")
WebElement newBtnAlert;



@FindBy (xpath="//i[@class=' fa fa-search']")
WebElement search1;

@FindBy (id="country_id")
WebElement country2;

@FindBy (id="st_id")
WebElement state2;

@FindBy (id="location")
WebElement location2;

@FindBy (name="Search")
WebElement search2;

@FindBy (xpath="//h1[@class='m-0 text-dark']")
WebElement textLocation;

@FindBy (xpath="//h4[@class='card-title']")
WebElement textSearchLocation;

public  ManageLocationPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	 }

public boolean clickLocation()
{
	 WaitUtility.visibilityOfEleLocated(driver,manageLocation );
	 PageUtility.performClick(driver,manageLocation );
	 return textLocation.getText().toString().contains("List Locations");
}
   public void newOnClick()
   {
	 WaitUtility.visibilityOfEleLocated(driver,manageLocation );
	 PageUtility.performClick(driver,manageLocation );
	
	 WaitUtility.visibilityOfEleLocated(driver,newButton );
	 PageUtility.performClick(driver,newButton );
	 
	/* WaitUtility.visibilityOfEleLocated(driver,country1 );
	 PageUtility.performClick(driver,country1 );
	 PageUtility.dropdown( country1, "United Kingdom"); */
	 
	 WaitUtility.visibilityOfEleLocated(driver,state1 );
	 PageUtility.performClick(driver,state1 );
	 PageUtility.dropdown(state1, "Bristol");
	 
	 WaitUtility.visibilityOfEleLocated(driver,location1 );
	 PageUtility.performClick(driver,location1 );
	 PageUtility.performSendKey(driver, location1, "B1");
	 
	 WaitUtility.visibilityOfEleLocated(driver,delivery );
	 PageUtility.performClick(driver,delivery );
	 PageUtility.performSendKey(driver, delivery, "10");
	 
	 WaitUtility.visibilityOfEleLocated(driver,saveButton );
	 PageUtility.performClick(driver,saveButton );
	
    }
  

    public boolean newButtonAlert()
    {
    	WaitUtility.visibilityOfEleLocated(driver, newBtnAlert);
    	boolean isDispalyed=PageUtility.isElementDisplayed(newBtnAlert);
    	return isDispalyed;

    }
	 
    
    public void searchOnClick()
    {
     WaitUtility.visibilityOfEleLocated(driver,manageLocation );
   	 PageUtility.performClick(driver,manageLocation );
   	 
 	 WaitUtility.visibilityOfEleLocated(driver,search1 );
 	 PageUtility.performClick(driver,search1 );
 	 
 	/* WaitUtility.visibilityOfEleLocated(driver,country2 );
	 PageUtility.performClick(driver,country2 );
	 PageUtility.dropdown(country2, "United Kingdom");  */
	 
 	 WaitUtility.visibilityOfEleLocated(driver,state2 );
 	 PageUtility.performClick(driver,state2 );
 	 PageUtility.dropdown(state2, "Bristol");
 	 
 	 WaitUtility.visibilityOfEleLocated(driver,location2 );
 	 PageUtility.performClick(driver,location2 );
 	 PageUtility.performSendKey(driver, location2, "B1");
 	 
 	 
 	 WaitUtility.visibilityOfEleLocated(driver, search2 );
 	 PageUtility.performClick(driver,search2 );
 	
 	 
     }
   
    public boolean isLocFound()
	{
		WaitUtility.visibilityOfEleLocated(driver,textSearchLocation );
		boolean isDisplayed=PageUtility.isElementDisplayed(textSearchLocation);
		return isDisplayed;	
	}
}
