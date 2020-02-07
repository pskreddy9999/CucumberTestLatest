package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import myRunner.CucumberRunner;

public class Demo extends CucumberRunner {

	/**
	 * @param args
	 * @throws InterruptedException  
	 */
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\windows\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://experitest.com/");
		
		mouseMoveToElement(By.xpath("//*[@class='ut-main-navigation-link sf-with-ul']"));
		
	}
	
	public static void mouseMoveToElement(By by) {

		try {
			
			WebElement ele = driver.findElement(by);
			if(ele.isEnabled()) {
				Actions ac = new Actions(driver);
				ac.moveToElement(ele).build().perform();
			}	
		}catch(NoSuchElementException nsee) {
			System.out.println("Element is not found");
		}
	}
}
