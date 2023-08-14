package pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.Elementutility;


public class Loginpage {
	Elementutility  eutil;
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		eutil=new Elementutility(driver);
	}
	@FindBy(id="input-email")
	public WebElement email;
	public void enteremail(String emailid) {
		//email.sendKeys(emailid);
		eutil.entertxttoelement(emailid, 200, email);
	}
	@FindBy(id="input-password")
	public WebElement password;
	public void enterpassword(String pass) {
		//password.sendKeys(pass);
		eutil.entertxttoelement(pass, 200, password);
	}
	@FindBy(xpath="//input[@value='Login']")
	public WebElement submit;
	public Profilepage clickonsubmit() {
		//submit.click();
		eutil.clickonelement(20, submit);
		return new Profilepage(driver);
		}
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	public WebElement errormessage;
	public void verifyerrormessage() {
		System.out.println(errormessage.getText());
		Assert.assertTrue(errormessage.getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}
	@FindBy(xpath="(//a[text()='Forgotten Password'])[1]")
	public WebElement forgottenpassword;
	public Forgottenpasswordpage clickonforgottenpassword() {
		eutil.clickonelement(30, forgottenpassword);
		return new  Forgottenpasswordpage(driver);
	}
	
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	public WebElement forgottenpassworedmessage;
	public void verifyforgottenpasswordmessage() {
		eutil.waitonelement1(50, forgottenpassworedmessage);
		Assert.assertTrue(forgottenpassworedmessage.getText().contains("An email with a confirmation link has been sent your email address."));
	}
	public void presstabkey() {
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB);
	}
	public Profilepage pressenterkey() {
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER);
		return new Profilepage(driver);
	}
	public Boolean verfifypasswordmasking(String attribute) {
		System.out.println(password.getAttribute(attribute));
		Boolean bl=password.getAttribute(attribute).contains("password");
		return bl;
	}
	@FindBy(xpath="//a[text()='Continue']")
	public WebElement continue1;
	public Registrationpage clickoncontinue() {
		eutil.clickonelement(30, continue1);
		return new Registrationpage(driver);
	}
	@FindBy(xpath="(//div[@id='account-login']//a[text()='Login'])[1]")
	public WebElement verifylogin;
	public void verifyloginpage() {
		Assert.assertTrue(verifylogin.isEnabled());
	}
	public void fetchloginpagedetail() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
		
	}
	@FindBy(xpath="//ul[@class='breadcrumb']/li")
	public List<WebElement> breakcrumb;
	public void getbeakcrumb() {
		for(WebElement we : breakcrumb ) {
			System.out.println(we.getText());
		}
	}
	
	

}
