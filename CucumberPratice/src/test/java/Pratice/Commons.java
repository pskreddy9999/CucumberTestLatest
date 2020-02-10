package Pratice;

import static io.appium.java_client.touch.TapOptions.tapOptions; // We need to write this import for TapOptions
import static io.appium.java_client.touch.offset.ElementOption.element; // We need to write this import for Element withElement(element(ele)));
import static io.appium.java_client.touch.LongPressOptions.longPressOptions; // Same above
import static java.time.Duration.ofSeconds;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

public class Commons extends Base {

	public static void clickElementWithByXpath(String byXpath) {

		WebElement ele = driver.findElementByXPath(byXpath);

		Assert.assertTrue(ele.isEnabled());
		ele.click();

	}

	public static void tapElementByXpath(String byXpath) {

		TouchAction ts = new TouchAction(driver);

		WebElement ele = driver.findElementByXPath(byXpath);
		if (ele.isEnabled() && ele != null) {
			ts.tap(tapOptions().withElement(element(ele))).perform();
		}
	}

	public static void tapWithUIAutomator(String byUIAutomator) {

		TouchAction ts = new TouchAction(driver);

		WebElement ele = driver.findElementByAndroidUIAutomator(byUIAutomator);
		if (ele != null) {
			ts.tap(tapOptions().withElement(element(ele))).perform();
		} else {
			System.out.println("Element not present");
		}
	}

	public static void ClickWithAndroidUiAutomator(String pathOfUiAutomator) {

		/******
		 * Second Way to find the UIAutomator as a locator with Attribute and Value
		 *****/

		WebElement ele = driver.findElementByAndroidUIAutomator(pathOfUiAutomator);
		
		Assert.assertTrue(ele.isEnabled());
		
		ele.click();
	}

	public static void clickElementWithIndexNumber(int indexNumber, String stepName) {

		List<AndroidElement> ele = driver.findElementsByClassName("android.widget.TextView");

		if (ele != null) {

			ele.get(0).click();
		} else {
			System.out.println("No such element");
		}
	}

	public static void longPressWithDurationByXpath(String byXpath, int seconds) {

		TouchAction ts = new TouchAction(driver);

		WebElement ele = driver.findElementByXPath(byXpath);
		if (ele.isDisplayed()) {

			ts.longPress(longPressOptions().withElement(element(ele)).withDuration(ofSeconds(seconds))).release()
					.perform();
		} else {
			System.out.println("Element not present");
		}
	}

	public static void validateTextOfElementById(String ById) {

		WebElement ele = driver.findElementById(ById);
		String actualText = ele.getText();
		String expectedText = "Sample action";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Actual Text: " + actualText + " And Expected Text: " + expectedText);
	}

	public static void swipeDemo() {

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();

		driver.findElementByXPath("//*[@content-desc='9']").click();
		WebElement mintsElement = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement mintsToSelectElement = driver.findElementByXPath("//*[@content-desc='55']");

		// 2nd way using the swape
		TouchAction ts = new TouchAction(driver);
		// long press // on element// 2 sec to move to element and you release

		ts.longPress(longPressOptions().withElement(element(mintsElement)).withDuration(ofSeconds(2)))
				.moveTo(element(mintsToSelectElement)).release().perform();

		WebElement ele = driver.findElementById("android:id/hours");
		String str = ele.getText();

		WebElement ele2 = driver.findElementById("android:id/minutes");
		String str2 = ele2.getText();

		WebElement ele1 = driver.findElementById("android:id/pm_label");
		String str1 = ele1.getText();

		System.out.println("Time we selected: " + str + ":" + str2 + "  " + str1);

	}

	public static void scrollingByUsingAndroidClass(String strValue) {

		// Appium doesn't support scrolling down methods below is Android Api only not
		// by appium code(Note: "new UiScrollable( ---> " not appium) this is not at all
		// related to appium

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + strValue + "\"));");
	}

	public static void dragAndDropByClassName(String className, int sourceIndex, int destinationIndex,
			String stepName) {

		WebElement source = driver.findElementsByClassName(className).get(sourceIndex);

		WebElement destination = driver.findElementsByClassName(className).get(destinationIndex);

		TouchAction ts = new TouchAction(driver);

		/***** Long press on ur source Object both will work ********/

		// ts.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();

		/**** We can use below also for drag and drop (New method) *******/

		ts.longPress(element(source)).moveTo(element(destination)).release().perform();

		WebElement ele = driver.findElementById("io.appium.android.apis:id/drag_text");
		String str = ele.getText();
		System.out.println("OutPut text is: " + str);
	}
	
	public static void keyBoardMethods() {
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		//Views - Native , Hybrid, WebView
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		//driver.hideKeyboard();
		
	}
	
	public static void  browserWithRemoteDeviceConnectionAndLaunchingUrl() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElementByXPath("//*[@id='txtUsername']").sendKeys("Admin");
	}
}
