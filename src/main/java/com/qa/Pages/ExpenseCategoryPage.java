package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.WaitUtility;

public class ExpenseCategoryPage extends Base
{

	@FindBy(xpath = "//i[@class='nav-icon fas fa-money-bill-alt']")
	WebElement manageExpenseDropDown;
	@FindBy(xpath = "//p[text()='Expense Category']")
	WebElement expenseCategory;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmessage;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButton;
	@FindBy(xpath="//input[@id='un']")
	WebElement searchtext;
	@FindBy(xpath="//button[@name='Search']")
	WebElement searchbutton2;
	@FindBy(xpath="//h4[text()='Search Expense Category']")
	WebElement searchexpensecategorytext;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement reset;
	@FindBy(xpath = "//input[@id='name']")
	WebElement textbox;
	

	public ExpenseCategoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ExpenseCategoryPageAction() 
	{
		WaitUtility.visibilityOfEleLocated(driver,manageExpenseDropDown );
		 PageUtility.performClick(driver,manageExpenseDropDown);
		 WaitUtility.visibilityOfEleLocated(driver,expenseCategory);

		 WaitUtility.visibilityOfEleLocated(driver,expenseCategory );
		 PageUtility.performClick(driver,expenseCategory);
		
		 WaitUtility.visibilityOfEleLocated(driver,newButton );
		 PageUtility.performClick(driver,newButton);
		
		 
		 WaitUtility.visibilityOfEleLocated(driver,textbox );
		 PageUtility.performClick(driver,textbox );
		 PageUtility.performSendKey(driver, textbox, "HELLO");
		 
		 WaitUtility.visibilityOfEleLocated(driver,savebutton );
		 PageUtility.performClick(driver,savebutton);
		
		 WaitUtility.visibilityOfEleLocated(driver,searchButton );
		 PageUtility.performClick(driver,searchButton);
		 
		 WaitUtility.visibilityOfEleLocated(driver,searchtext );
		 PageUtility.performClick(driver,searchtext );
		 PageUtility.performSendKey(driver, searchtext, "hello");
		
		 WaitUtility.visibilityOfEleLocated(driver,searchbutton2);
		 WaitUtility.visibilityOfEleLocated(driver,searchbutton2 );
		 PageUtility.performClick(driver,searchbutton2);
		 
		 WaitUtility.visibilityOfEleLocated(driver,reset );
		 PageUtility.performClick(driver,reset);
		
		
	}

	public boolean expenseCategoryPageNewButtonElement() 
	{
		WaitUtility.visibilityOfEleLocated(driver, newButton);
		boolean isDisplayed=PageUtility.isElementDisplayed(newButton);
		return isDisplayed;
	}

	public boolean expenseCategoryPageSearchButtonElement() 
	{

		WaitUtility.visibilityOfEleLocated(driver, searchButton);
		boolean isDisplayed=PageUtility.isElementDisplayed(searchButton);
		return isDisplayed;
	}

	}
