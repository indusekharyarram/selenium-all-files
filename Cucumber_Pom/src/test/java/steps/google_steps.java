package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main_java.google_java;


public class google_steps {
	
	google_java gj= new google_java();
	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() throws Throwable {
		gj.url();
	}

	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage() throws Throwable {
		gj.google_homepage();
	}

	@Then("^verify textbox$")
	
	public void verify_textbox() throws Throwable {
		gj.verify();
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
		gj.submit();
	}


}
		
