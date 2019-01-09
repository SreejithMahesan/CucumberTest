package StepDefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample01StepDefinition {
	

@Given("^the \"([^\"]*)\" is at home page$")
public void the_is_at_home_page(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User_is_at_home_page" + arg1);
}

@Given("^the \"([^\"]*)\" navigates to the profile page$")
public void the_navigates_to_the_profile_page(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("navigates to the profile page"+ arg1);
}

@When("^the \"([^\"]*)\" validates the \"([^\"]*)\" in the profile page$")
public void the_validates_the_in_the_profile_page(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("validates the UserName"+ arg2);
	System.out.println("User is: "+ arg1);
	Assert.assertEquals(arg1, arg2);
}

@Then("^the \"([^\"]*)\" should be displayed correctly$")
public void the_should_be_displayed_correctly(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("UserName should be displayed correctly"+ arg1);
}



}
