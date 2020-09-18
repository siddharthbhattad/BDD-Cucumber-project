package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver ;

	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\BDD-Cucumber-project\\BDDCucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

	}
		
	@Given("^user has an url$")
	public void user_has_an_url() throws Throwable {
	    System.out.println("url");
	    throw new PendingException();
	}
	
	@When("^user opens url$")
	public void user_opens_url() throws Throwable {
	    System.out.println("User is on mentioned website");
	    throw new PendingException();
	}

	@Then("^user needs to enter userid and password$")
	public void user_needs_to_enter_userid_and_password() throws Throwable {
	    System.out.println("id");
	    throw new PendingException();
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		System.out.println("submit");
	    throw new PendingException();
	}

	@Then("^user is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
	    System.out.println("User is logged in successfully");
	    throw new PendingException();
	}


	@After
	public void teardown() {
		driver.quit();
	}

}
