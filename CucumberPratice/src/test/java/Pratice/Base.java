package Pratice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base {

	public static AndroidDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {

		// File fi = new File("/ApkFile");
		// File fis = new File(fi, "ApiDemos-debug.apk");
		
		/*****1) When we using Emulator then we need to use Android device name(POCApp)
		     2) When you connect Real Device no need to give the name just give -> (Android Device)  ****/

		DesiredCapabilities ds = new DesiredCapabilities();
		
		if(device.equals("emulator")) {		
			 ds.setCapability(MobileCapabilityType.DEVICE_NAME, "POCApp"); 
		}else if(device.equals("real")){
			ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
																
		ds.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\spemmana\\git\\CucumberRepo\\CucumberPratice\\ApkFile\\ApiDemos-debug.apk");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), ds);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
  public static AndroidDriver<AndroidElement> invokingWithPackage() throws MalformedURLException {
		
		/*
		 *        Here we don't have .APK File (Note: We have only Mobile and Particular application name)
		 * 1) First we need to get the package name of that Application (Every app will have unique package name)
		 * 2) And next what activity we need to launch:-
		 *         (Activity means: For an app there might be a  multiple pages so each page will have an activity name 
		 *               ie: If there are 10 pages then there are 10 activities)
		 *       -> First page will be the Main launch activity
		 *       
		 *  3) To Know about the particular package name we have one application which is play store "Apk info" 
		 *     we can download it and see the app info  
		 */
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,  MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability("appPackage", "io.ionic.starter");
		cap.setCapability("appActivity", "io.ionic.starter.MainActivity");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;	
	}
  
  public static AndroidDriver<AndroidElement> mobileBrowsers() throws MalformedURLException {
	  
	  DesiredCapabilities cap = new DesiredCapabilities();

	  
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	  cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	  cap.setCapability("chromedriverExecutable", "C:\\Users\\spemmana\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
	  
	  //cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
	  //capabilities.setCapability("appPackage", "com.android.chrome");
	  //capabilities.setCapability("browserName", "Chrome");
	  // cap.setCapability("appActivity", "com.google.android.browser.download.DownloadActivity");
	  //cap.setCapability("adbExecTimeout", 40000);
 
	  driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  return driver;
  }

}
