package Pratice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {
	public static AndroidDriver<AndroidElement>  driver;
	
	public void  capabilities() throws MalformedURLException 
	{
	
	/* File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");*/
	
	     DesiredCapabilities capabilities = new DesiredCapabilities(); //Thank You ... Forever grateful
	     
	     //capabilities.setCapability("platformName", "Android");
	     capabilities.setCapability("deviceName", "Android Device");
	     //capabilities.setCapability("appPackage", "com.android.chrome");
	     //capabilities.setCapability("browserName", "Chrome");
	     capabilities.setCapability("appActivity", "com.google.android.browser.download.DownloadActivity");
	     //capabilities.setCapability("adbExecTimeout", 40000);
	     capabilities.setCapability("chromedriverExecutable", "C:\\Users\\spemmana\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");

	     driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	     //driver.get("https://www.google.com/");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	    
	    // C:\Users\spemmana\node_modules\appium\node_modules\appium-chromedriver\chromedriver\win  exe path
	    //C:\Users\spemmana\node_modules\appium\node_modules\appium-chromedriver\lib\chromedriver.js
  
	     
	     /*
	      * 
	      * 
	      * deviceApiLevel: 23,
	            deviceManufacturer: LENOVO, 
	            deviceModel: Lenovo TB3-X70F,
	            deviceName: 8HHMT8DYU47LIFE6, 
	            deviceScreenDensity: 240,
                deviceScreenSize: 1920x1200, 
                deviceUDID: 8HHMT8DYU47LIFE6, 
                javascriptEnabled: true, 
                locationContextEnabled: false, 
                networkConnectionEnabled: true,
                pixelRatio: 1.5,
                platform: LINUX,
                platformName: Android, 
                platformVersion: 6.0, 
                statBarHeight: 36,
                takesScreenshot: true, 
                viewportRect: {height: 1092,
	    	    	          left: 0,
	    	    	          top: 36,
	    	    	          width: 1920}, 
                warnings: {}, webStorageEnabled: false} */
	  
	}
	
	public void searchKeyword() throws InterruptedException {
		
		driver.findElementByXPath("//*[@class='gLFyf']").sendKeys("appium");
		Thread.sleep(5000);
	}
	
	public void tearDown() {
		
		driver.quit();
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		BaseChrome bs = new BaseChrome();
		bs.capabilities();
		//bs.searchKeyword();
		//bs.tearDown();
		
	}

}
