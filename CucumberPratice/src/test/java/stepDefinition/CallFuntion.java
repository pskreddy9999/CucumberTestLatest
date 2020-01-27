package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myRunner.CucumberRunner;

public class CallFuntion extends CucumberRunner {
	
	
	
	 
	 @Then("^Click on Admin link$")
	 public void click_On_Company_List()
	 {
		 
		 driver.findElement(By.partialLinkText("Admin")).click();
	 }
	 
}


