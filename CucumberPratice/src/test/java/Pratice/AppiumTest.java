package Pratice;

import java.net.MalformedURLException;


public class AppiumTest extends Base{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

/*******  Main capabilities to run                     ********/	
		
	    //Base.Capabilities("emulator");

/*******  1) Getting the pop text, touch options and long press   ********/
	    
		/*Commons.tapElementByXpath("//android.widget.TextView[@text='Views']");
		Commons.tapElementByXpath("//android.widget.TextView[@text='Expandable Lists']");
		Commons.tapWithUIAutomator("text(\"1. Custom Adapter\")");
		Commons.clickElementWithIndexNumber(0,"Clicking the element with index Number");
		Commons.longPressWithDurationByXpath("//android.widget.TextView[@text='People Names']", 3);
		Thread.sleep(2000);
		Commons.validateTextOfElementById("android:id/title");*/
	    
/*******   2) Using clicking & senKeys with different locators using *********/

		/*driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello World");
		driver.findElementsByClassName("android.widget.Button").get(1).click();*/
	    
/********	3) Swape the (Re_seting Clock using TouchAction)       ********/
	    
	    //Commons.swipeDemo();
	    
/********   4) Clicking the elements by using Android UI UIAutomator we can use like locator ********/
	     
	    /*Commons.ClickWithAndroidUiAutomator("text(\"Views\")");
	    Commons.ClickWithAndroidUiAutomator("text(\"Animation\")");*/
	    
	   //Validate clickable feature for all options
	  	//System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
               
/********    5) Scrolling                                        **********/
	    
	   /*Commons.clickElementWithByXpath("//android.widget.TextView[@text='Views']");
	    Commons.scrollingByUsingAndroidClass("Radio Group");*/
	     
/*********   6) Drag And Drop                                    **********/
	    
	   /* Commons.clickElementWithByXpath("//android.widget.TextView[@text='Views']");
	    Commons.clickElementWithByXpath("//android.widget.TextView[@text='Drag and Drop']");
	    Commons.dragAndDropByClassName("android.view.View", 0 , 1 ,"We are using Index based(Class Name is same) to drag and drop, According to that give the values");*/

/********   7)  Miscellaneous Key Events                           *******/	
	    
	    /*Commons.keyBoardMethods();
	    Commons.clickElementWithByXpath("//android.widget.TextView[@text='Views']");*/
		
	   // driver.pressKeyCode(AndroidKeyCode.BACK); Not working this refer different on website
	    
/******    8) Running with package                                 ********/
	    
	   // Commons.invokingWithPackage();
		
/*******  9) Browser launch to automate with different capabilities *******/	
		
		Base.mobileBrowsers();
		Commons.browserWithRemoteDeviceConnectionAndLaunchingUrl();
	}
	

}
