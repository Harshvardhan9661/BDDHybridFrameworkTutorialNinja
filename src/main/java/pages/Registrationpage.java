package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.Elementutility;

public class Registrationpage {
	Elementutility  eutil;
	WebDriver driver;
	public Registrationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		eutil=new Elementutility(driver);
	}
	@FindBy(xpath="(//div[@id='account-register']//a[text()='Register'])[1]")
	public WebElement verifyregister;
	public void verifyregistrationpage() {
		Assert.assertTrue(verifyregister.isEnabled());
	}
	public Loginpage navigateback() throws InterruptedException {
		eutil.navigateback(3000);
		return new Loginpage(driver);
	}
	


}
