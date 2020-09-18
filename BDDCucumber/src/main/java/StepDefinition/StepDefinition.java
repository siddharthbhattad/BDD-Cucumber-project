package StepDefinition;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver ;
	
	@Given("^user has an url$")
	public void user_has_an_url() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "G:\\Siddharth\\Workspace\\latest\\BDDCucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
	    throw new PendingException();
	}

//	@When("^user opens url$")
//	public void user_opens_url() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^user needs to enter userid and password$")
//	public void user_needs_to_enter_userid_and_password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^click on submit button$")
//	public void click_on_submit_button() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^user is logged in successfully$")
//	public void user_is_logged_in_successfully() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//

	@Before
	public void teardown() {
		driver.quit();
	}

}
