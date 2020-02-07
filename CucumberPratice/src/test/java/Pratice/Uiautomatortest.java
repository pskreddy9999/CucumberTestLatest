package Pratice;

import java.net.MalformedURLException;

public class Uiautomatortest extends Base {
	
	public static void main(String[] args) throws MalformedURLException {
		
		 Base.Capabilities("real");
		
		//Second Way to find the UIAutomator as a locator with Attribute and Value
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		//Validate Clickable feature for all options
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
	}

}
