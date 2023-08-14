package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.Elementutility;

public class Homepage extends Headersection {
      public WebDriver driver;
      Elementutility  eutil;
      public Homepage(WebDriver driver) {
    	  super(driver);
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
    	  eutil=new Elementutility(driver);
      }
     /* @FindBy(xpath="//a[@title='My Account']")
      public WebElement myaccount;
      public void clickonmyaccount() {
    	 // myaccount.click();
    	  eutil.clickonelement(20, myaccount);
      }
      @FindBy(xpath="//a[text()='Login']")
      public WebElement login;
      public Loginpage clickonlogin() {
    	  //login.click();
    	  eutil.clickonelement(200, login);
    	  return new  Loginpage(driver);
      }*/
      public void verifyhomepage() {
    	  clickonmyaccount();
    	 
    	  try {
    	   Assert.assertTrue(login.isDisplayed());
      }
    	  catch(Throwable e) {
    		  System.out.println(e.getMessage());
    	  }	
    	  
}}
