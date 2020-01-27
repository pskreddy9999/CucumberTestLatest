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

public class LoginStepDefinition extends CucumberRunner {

	@Given("^user is in Login Page$")
	public void user_already_on_login_page() {

		//driver.get("https://ui.freecrm.com/");
		System.out.println("We are validating the lgin");
	}

	@When("^title of login page is Free HRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);
		

		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath("//*[@class='icon icon-xs mdi-chart-bar']")); //
		 * JavascriptExecutor jse = (JavascriptExecutor)driver;
		 * //jse.executeScript("arguments[0].click();", ele );
		 */
	}

	// Reg Exp:
	// 1. \"([^\"]*)\"
	// 2. \"(.*)\"

	@Then("^wait for some time$")
	public void wait_For_Some_Time() throws IOException {

		implicitWait(4000);
		
		
		takeScreenshot("LoginPage");
		WebElement ele = driver.findElement(By.xpath("//*[@id='logInPanelHeading']"));

		explicitWait(ele);

	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.id("txtUsername")).sendKeys(username);

		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^click on maintenance link$")
	public void Click_On_Cases_Link() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("Maintenance")).click();
	}
	

	 @Then("^click on Settings option$")
	 public void click_On_Settings() {
		 driver.findElement(By.id("welcome")).click();
	 }
	 
	 @Then("^click on logout option$")
	 public void Click_On_LogOut() throws IOException {
		 driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
		 takeScreenshot("AfterWithSmokeLogout");
	 }	

}
