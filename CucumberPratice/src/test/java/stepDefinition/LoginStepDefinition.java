package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myRunner.CucumberRunner;

public class LoginStepDefinition extends CucumberRunner{

	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 
		 
		 driver.get("https://www.freecrm.com/index.html");
	 }
	
	
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	 
	 
	 WebElement ele = driver.findElement(By.xpath("//*[@class='icon icon-xs mdi-chart-bar']"));
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].click();", ele );
	 }
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
	 driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
	 }
	 
	 @Then("^user moves to new contact page$")
	 public void user_moves_to_new_contact_page() throws InterruptedException {
		//driver.switchTo().frame("mainpanel");
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		 Thread.sleep(4000);
		driver.findElement(By.xpath("//*[contains(text(),'Contacts')]")).click();
		
		}
	 
	 
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname) throws InterruptedException{
		
		 driver.findElement(By.xpath("//*[contains(text(),'New')]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.name("first_name")).sendKeys(firstname);
		 driver.findElement(By.name("last_name")).sendKeys(lastname);
		 Thread.sleep(3000); 
		 driver.findElement(By.xpath("//*[@class='ui linkedin button']")).click();
		
		 driver.findElement(By.xpath("//*[@class='ui buttons']//following-sibling::div/i")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
		 Thread.sleep(5000);
	 }
	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		// driver.quit();

		 System.out.println("closing the browsing");
	 }
	
	
	

}
