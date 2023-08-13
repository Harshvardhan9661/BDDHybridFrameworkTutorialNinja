package stepdefinition1;

import org.openqa.selenium.WebDriver;

import config.Readconfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Forgottenpasswordpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Profilepage;
import pages.Registrationpage;
import utility.Baseclass;
import utility.Elementutility;

public class LoginTest  {
	public WebDriver driver;
	public Loginpage lp;
	public Profilepage pp;
	public Baseclass bc;
	public 	Forgottenpasswordpage fp;
	public Elementutility eu;
	public Registrationpage rp;
	
	@Given("user should navigate to login page")
	public void user_should_navigate_to_login_page() throws InterruptedException {
		driver=Baseclass.getdriver();
		
		Homepage hp=new Homepage(driver);
		hp.clickonmyaccount();
		lp=hp.clickonlogin();
	}

	@When("^user should enter email(.+)$")
	public void user_should_enter(String email) {
		lp.enteremail(email);
	}

	@When("^user should enter password(.+)$")
	public void user_should_enter_harsh(String password) {
		lp.enterpassword(password);
	   
	}

	@When("user should click on login page")
	public void user_should_click_on_login_page() {
	 pp=lp.clickonsubmit();
	}

	@Then("user should navigate to profile page")
	public void user_should_navigate_to_profile_page() {
	 pp.verifyaccountedit();
	}
	
	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
		lp.verifyerrormessage();
	}
	
	@When("user should click on forgotten password link")
	public void user_should_click_on_forgotten_password_link() {
	 fp=lp.clickonforgottenpassword();
	  
	}

	@Then("user should navigate to forgotten page")
	public void user_should_navigate_to_forgotten_page() {
	    //will implement letter
	}

	@Then("user should enter their email address")
	public void user_should_enter_their_email_address() {
		fp.enteremail("harshvardhan9661@gmail.com");
		lp=fp.clickoncontinue();
	}

	@Then("then user should again navigate to login page")
	public void then_user_should_again_navigate_to_login_page() {
		//in progress
	}

	@Then("user should see correct message in login page")
	public void user_should_see_correct_message_in_login_page() {
		lp.verifyforgottenpasswordmessage();}
	
	@When("user enter email address {string}")
	public void user_enter_email_address(String email) {
		lp.enteremail(email);
		}
	@And ("^press tab key$")
	public void press_tab_key() {
		lp.presstabkey();
	}
	@And("user enter password {string}")
	public void user_enter_password(String password) {
		lp.enterpassword(password);
		}
	@And ("^double press tab key$")
	public void double_press_tab_key() {
		lp.presstabkey();
		lp.presstabkey();
	}
	@And ("^click on enter$")
	public void click_on_enter() {
		pp=lp.pressenterkey();
	}
	@When("user enter password into password fielde {string}")
	public void user_enter_password_into_password_fielde(String password) {
		lp.enterpassword(password);
	}
	
	@Then("fetch the value of entered and verify the entered value")
	public void fetch_the_value_of_entered_and_verify_the_entered_value() {
		System.out.println(lp.verfifypasswordmasking("value"));
		//type is password then element is password 
		//to get password we have use value field 
		}
	@And("user should close the browser")
	public void user_should_close_the_browser() {
		driver.close();
	}
	@And("after closing user should again open the browser")
	public void after_closing_user_should_again_open_the_browser() {
		Baseclass.launchbrowser("chrome");
		driver=Baseclass.getdriver();
		Readconfig rc=new Readconfig();
		driver.get(rc.geturl());
		driver.manage().window().maximize();
	}
	@Then("user should see the logout button inside profile page")
	public void user_should_see_the_logout_button_inside_profile_page() {
		pp=new Profilepage(driver);
		pp.clickonprofile();
		pp.verifylogout();
	}
	@When("user should click on continue button under new customer section")
	public void user_should_click_on_continue_button_under_new_customer_section() {
		rp=lp.clickoncontinue();
		
	}
	@And("user should navigate to Registration page")
	public void user_should_navigate_to_Registration_page() {
		rp.verifyregistrationpage();
	}
	@And("user should navigate back")
	public void user_should_navigate_back() throws InterruptedException {
		lp=rp.navigateback();
	}
	@Then("user should again navigated to login page")
	public void user_should_again_navigated_to_login_page() {
		lp.verifyloginpage();
	}
	
	@When("user should fetch Breakcrumb PageHeading PageTitle and PageURL of login page")
	public void user_should_fetch_Breakcrumb_PageHeading_PageTitle_and_PageURL_of_login_page(){
		lp.getbeakcrumb();
		lp.fetchloginpagedetail();
	}
	@Then("Breakcrumb PageHeading PageTitle and PageURL should show currenctly")
	public void Breakcrumb_PageHeading_PageTitle_and_PageURL_should_show_currenctly() {
		//will implement letter
	}
	
	}
	
