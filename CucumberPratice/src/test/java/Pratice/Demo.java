package Pratice;

import org.openqa.selenium.chrome.ChromeDriver;

import myRunner.CucumberRunner;

public class Demo extends CucumberRunner {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\windows\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		
		String str = driver.getTitle();
		System.out.println(str);

	}

}
