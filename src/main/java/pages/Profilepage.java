package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.Elementutility;

public class Profilepage {
	WebDriver driver;
	Elementutility eutility;
	public Profilepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		eutility=new Elementutility(driver);
	}
	@FindBy(xpath="//a[text()='Edit your account information']")
	public WebElement editprofile;
	public void verifyaccountedit() {
		try {
		Assert.assertTrue(editprofile.getText().contains("Edit your account information"));
	}
		catch(Exception e) {
			e.getMessage();
		}

}
	@FindBy(xpath="//a[@title='My Account']")
	public WebElement  myaccount;
	public void clickonprofile() {
		eutility.clickonelement(30, myaccount);
	}
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement  logout;
	public void verifylogout() {
		Assert.assertTrue(logout.isEnabled());
	}
	
	}
