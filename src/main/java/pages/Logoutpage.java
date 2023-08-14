package pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Elementutility;

public class Logoutpage {
	WebDriver driver;
	Elementutility eutil;
	public Logoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		eutil=new Elementutility(driver);
	}
	
	@FindBy(xpath="//a[text()='Continue']")
	public WebElement logoutcontinue;
	public Homepage clickoncontinue() {
		eutil.clickonelement(30, logoutcontinue);
		return new Homepage(driver);
	}
	@FindBy(xpath="//div[@id='common-success']//ul//a")
	public List<WebElement> breakerlist;
	public Boolean verifylogoutpagedetail() {
		Boolean bl=false;
		
		for(WebElement we:breakerlist ) {
			System.out.print(we.getText()+">>");
			if(we.getText().equals("Logout")) {
				bl=true;
				break;
			}
			}
		return bl;
		}
		public void fetchpagedetail() {
			String title=driver.getTitle();
			String url=driver.getCurrentUrl();
			System.out.println("Title of logout page is :"+title);
			System.out.println("url of logout page is :"+url);
		
		}}
