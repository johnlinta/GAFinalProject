package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.utility.PageUtility;
import com.qa.utility.WaitUtility;

public class ManageProductPage extends Base
{

	@FindBy(xpath = "//p[text()='Manage Product']")
	WebElement manageproduct;

	@FindBy(xpath = "	//a[@onclick='click_button(1)']")
	WebElement newbtn;

	@FindBy(id = "title")
	WebElement title;

	@FindBy(id = "tag")
	WebElement tag;

	@FindBy(xpath = "//input[@value='Others']")
	WebElement producttype;

	@FindBy(id = "cat_id")
	WebElement category;

	@FindBy(id = "sub_id")
	WebElement subcat;

	@FindBy(id = "grp_id")
	WebElement groupid;

	@FindBy(id = "m_weight")
	WebElement weightvalue;

	@FindBy(id = "w_unit")
	WebElement weightunit;

	@FindBy(id = "max_weight")
	WebElement maxwt;

	@FindBy(id = "w_price")
	WebElement price;

	@FindBy(id = "w_mrp")
	WebElement mrp;

	@FindBy(id = "w_stock")
	WebElement stockavailability;

	@FindBy(id = "w_pp")
	WebElement purchaseprice;

	@FindBy(xpath = "//button[@data-backcolor='#FFFF00']")
	WebElement acolor;

	@FindBy(xpath = "//div[@class='note-editable card-block']")
	WebElement blocktext;

	@FindBy(xpath = "//button[@data-original-title='Bold (CTRL+B)']")
	WebElement fontb;

	@FindBy(id = "main_img")
	WebElement imagefile;

	@FindBy(id = "main_imgs")
	WebElement subimagefile;
	
	@FindBy(xpath = "//label[text()='Tag']")
	WebElement tagtext;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement savebtn;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbtn;

	@FindBy(name = "un")
	WebElement searchtitle;

	@FindBy(id = "sb")
	WebElement searchcategory;

	@FindBy(xpath = "//button[@value='sr']")
	WebElement searchsubmit;

	@FindBy(xpath = "//h1[text()='List Products']")
	WebElement listproductstitle;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement searchreset;
	
	@FindBy(id="main_img")
    WebElement browse;
	
	@FindBy(name="Search")
	WebElement search;
	
	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		 PageFactory.initElements(driver, this);

	}

	public void testManageProductPage() 
	{
		PageUtility.performClick(driver,manageproduct);
		PageUtility.performClick(driver,newbtn);
		PageUtility.performClick(driver,title);
		PageUtility.performSendKey(driver,title, "BANANA");
		PageUtility.performClick(driver,tag);
	
		PageUtility.performSendKey(driver,tag, "FRESH");
		PageUtility.performClick(driver,producttype);
		PageUtility.performClick(driver,category);
        
		WaitUtility.visibilityOfEleLocated(driver,category );
		 PageUtility.performClick(driver,category );
		 PageUtility.dropdown(category, "Personal Care");
		 
		PageUtility.performClick(driver,groupid);
		
		WaitUtility.visibilityOfEleLocated(driver,groupid );
		 PageUtility.performClick(driver,groupid );
		 PageUtility.dropdown(groupid, "New");

		PageUtility.performClick(driver,weightvalue);
		PageUtility.performSendKey(driver,weightvalue, "4");
		PageUtility.performClick(driver,weightunit);
		
		WaitUtility.visibilityOfEleLocated(driver,weightunit );
		 PageUtility.performClick(driver,weightunit );
		 PageUtility.dropdown(weightunit, "kg");

		PageUtility.performClick(driver,maxwt);
		PageUtility.performSendKey(driver,maxwt, "100");

		PageUtility.performSendKey(driver,price, "60");

		PageUtility.performSendKey(driver,mrp, "60");

		PageUtility.performSendKey(driver,stockavailability, "100");

		PageUtility.performSendKey(driver,purchaseprice, "240");

		PageUtility.performSendKey(driver,blocktext, "order details updated");
		
				
	}
		/*public void pic()
		
		{
		WaitUtility.waitWithMilliSeconds(driver, 3000);
		WaitUtility.visibilityOfEleLocated(driver,imagefile);
		PageUtility.performClick(driver,imagefile);
		
		imagefile.sendKeys("C:\\Users\\admin\\Pictures");  
		} */
		
	
	public void testSearchBtn()
	{
		PageUtility.performClick(driver,manageproduct);
		PageUtility.performClick(driver,searchbtn);
		PageUtility.performSendKey(driver,searchtitle, "banana");
		
		WaitUtility.visibilityOfEleLocated(driver,category );
		 PageUtility.performClick(driver,category );
		 PageUtility.dropdown(category, "Personal Care");
		
		PageUtility.performClick(driver,searchcategory );
		 PageUtility.dropdown(searchcategory, "Oral Care");
		 
		 WaitUtility.visibilityOfEleLocated(driver,searchsubmit );
		 PageUtility.performClick(driver,searchsubmit );
	}


	
	public void testResetBtn()
	{
		PageUtility.performClick(driver,searchreset);

	}  

}


