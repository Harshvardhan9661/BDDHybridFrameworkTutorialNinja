package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Elementutility;

public class Forgottenpasswordpage {
	WebDriver driver;
	Elementutility eutil;
	public Forgottenpasswordpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		eutil=new Elementutility(driver);
	}
	@FindBy(id="input-email")
	public WebElement email;
	public void enteremail(String emailid) {
		eutil.entertxttoelement(emailid, 30, email);
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement continue1;
	public Loginpage clickoncontinue() {
		eutil.clickonelement(30, continue1);
		return new Loginpage(driver);
	}

}
