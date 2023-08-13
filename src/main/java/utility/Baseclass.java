package utility;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static  WebDriver driver;
	
	
	public  static void launchbrowser(String browser) {		
		switch(browser) {
		case "chrome": WebDriverManager.chromedriver().setup();
		               driver=new ChromeDriver();
		               break;
		case  "edge": WebDriverManager.edgedriver().setup();
		 				driver=new EdgeDriver();
		 				break;
		case  "firefox": WebDriverManager.firefoxdriver().setup();
			            driver=new FirefoxDriver();
			            break;}		
	}
	public static WebDriver getdriver() {
		
		return driver;
	}
}
