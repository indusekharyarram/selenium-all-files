package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main_java.google_java;
import main_java.guru99_java;

public class guru99_steps extends guru99_java   {
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
		 launchUrl();
	}
	@When("^the user opens guru99 homepage$")
	public void the_user_opens_guru_homepage(int arg1) throws Throwable {
		homepage();
	}

	@When("^selects cucumber testing from testing list$")
	public void selects_cucumber_testing_from_testing_list() throws Throwable {
		cucumber();
	}

	@Then("^the user should navigate to cucumber tutorial$")
	public void the_user_should_navigate_to_cucumber_tutorial() throws Throwable {
		tutorial();
	}

	
	
	
}