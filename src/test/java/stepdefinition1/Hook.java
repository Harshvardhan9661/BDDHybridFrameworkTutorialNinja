package stepdefinition1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Readconfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Baseclass;

public class Hook {
	public static Readconfig pro;
	public WebDriver driver;
	
	@Before
	public  void setup() {
		pro=new Readconfig();
		Baseclass.launchbrowser("chrome");
		
		driver=Baseclass.getdriver();
	    driver.manage().window().maximize();
	    driver.get(pro.geturl());
    }
	@After
	public void teardown() {
		driver.quit();
		}
	
	}
