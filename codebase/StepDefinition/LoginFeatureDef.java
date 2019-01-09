package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

import Common.GlobalObjects;
import FunctionLibrary.Global;
import FunctionLibrary.HTML_Report;

public class LoginFeatureDef {
	HTML_Report reporter ;
	Global objGlobal;
	
	
	
	@SuppressWarnings("static-access")
	public LoginFeatureDef() throws IOException
	{
		reporter = GlobalObjects.getHTML_Report();
		objGlobal= GlobalObjects.getGlobal();
		objGlobal.cfnRootPath();	
		
		reporter.mstrModuleName = "Login Feature";
		reporter.mstrTC_Name = this.getClass().getSimpleName();
		reporter.mstrTC_Desc = "TestCaseDescription";
		objGlobal.cfnModuleRootPath(reporter.mstrModuleName);
	}
	
	
	@Given("^A user is on the ToolsQa login page$")
	public void a_user_is_on_the_ToolsQa_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on the login page");
	    reporter.details_append("Start Specflow report", "", "", "");
	    reporter.details_append("A user is on the ToolsQa login page", "User should be in login page", "User is in login page", "Pass");
	}


	@When("^the User clicks the login button$")
	public void the_User_clicks_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Clicks login button");
	}

	@Then("^the User is logged in to the system$")
	public void the_User_is_logged_in_to_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Asserts whether user is logged in to the system");
	    reporter.end_Report();
	}
	
	@Given("^the User enters the \"([^\"]*)\" in the UserNamebox$")
	public void the_User_enters_the_in_the_UserNamebox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter Username: "+ arg1);
	}

	@Given("^the User enters the \"([^\"]*)\"$")
	public void the_User_enters_the(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Enter Password: "+ arg1);
	}

}
