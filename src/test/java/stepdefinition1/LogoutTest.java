package stepdefinition1;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Headersection;
import pages.Homepage;
import pages.Loginpage;
import pages.Logoutpage;
import pages.Profilepage;
import utility.Baseclass;

public class LogoutTest {
	WebDriver driver;
    Homepage hp;
    Loginpage lp;
    Profilepage pp;
    Logoutpage lo;
    Headersection hs;
	@Given("User should successfully login with valid credential <userid> <password>")
	public void user_should_successfully_login_with_valid_credential_userid_password(DataTable  datatable) {
		driver=Baseclass.getdriver();
		hp=new Homepage(driver);
	   hp.clickonmyaccount();
	  lp= hp.clickonlogin();
	  Map<String,String> map=datatable.asMap();
	   lp.enteremail(map.get("userid"));
	   lp.enterpassword(map.get("password"));
	   lp.clickonsubmit();
	}

	@And("user click on myaccount dropdown menu")
	public void user_click_on_myaccount_dropdown_menu() {
	    hs= new Headersection(driver);
		hs.clickonmyaccount();
		
	  
	}

	@When("user select logout option")
	public void user_select_logout_option() {
		lo=hs.clickonlogout();
	}

	@When("user should click on continue button")
	public void user_should_click_on_continue_button() {
	  hp=lo.clickoncontinue();
	}

	@Then("user should successfully navigate to Home page")
	public void user_should_successfully_navigate_to_home_page() {
	  hs.clickonmyaccount();
	  hp.verifyhomepage();
	}

	@When("user should be fetch pagetitle,pageheading,pageurl, and breadcrum of logout page")
	public void user_should_be_fetch_pagetitle_pageheading_pageurl_and_breadcrum_of_logout_page() {
		lo.fetchpagedetail();
	}

	@Then("pagetitle,pageheading,pageurl, and breadcrum should be appropiate")
	public void pagetitle_pageheading_pageurl_and_breadcrum_should_be_appropiate() {
	 Assert.assertTrue(lo.verifylogoutpagedetail());
	}


}
