package utility;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementutility {
	WebDriver driver;
	public Elementutility(WebDriver driver) {
		this.driver=driver;
	}
	public void entertxttoelement(String txt,long Timeout,WebElement element) {
		WebElement we=waitonelement1(Timeout,element );
		we.sendKeys(txt);
		
	}
	public void clickonelement(long Timeout,WebElement element) {
		WebElement we=waitonelement1 (Timeout,element );
		we.click();
		
	}
	public void navigateback(long Timeout) throws InterruptedException {
		Thread.sleep(Timeout);
		driver.navigate().back();
	}
	
	public WebElement waitonelement1 (long Timeout,WebElement element ) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Timeout));
		WebElement we=wait.until(ExpectedConditions.elementToBeClickable(element));
		return we;
	}

	

}
