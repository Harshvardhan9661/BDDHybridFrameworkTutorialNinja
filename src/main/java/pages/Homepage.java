package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Elementutility;

public class Homepage {
      public WebDriver driver;
      Elementutility  eutil;
      public Homepage(WebDriver driver) {
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
    	  eutil=new Elementutility(driver);
      }
      @FindBy(xpath="//a[@title='My Account']")
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
      }
}
