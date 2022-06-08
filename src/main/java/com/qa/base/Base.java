package com.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class Base 
{
	public  WebDriver driver; //declared as public
    //@BeforeSuite
	
	@BeforeClass
	public void initializeDriver()
	{
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\chromedriver.exe"); 
    driver = new ChromeDriver();
	driver.get("https://groceryapp.uniqassosiates.com/admin");
	driver.manage().window().maximize();
	//return driver;
	
	  }	
}
