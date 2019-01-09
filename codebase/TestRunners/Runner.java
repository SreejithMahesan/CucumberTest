package TestRunners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Features",
glue = {"StepDefinition"},
tags = {"@Login"}
		)
public class Runner 
{
	
}
