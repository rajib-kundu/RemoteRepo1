package com.example.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FristGridProgram {

	public static RemoteWebDriver driver;
	
	//@Test
	//@Parameter
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//webdriver.firefox.marionette
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\workspace\\SeleniumGrid\\FirefoxDriver\\geckodriver.exe");
		@SuppressWarnings("static-access")
		DesiredCapabilities caps = new DesiredCapabilities().firefox();
		caps.setPlatform(Platform.WIN8_1);
		caps.setBrowserName("firefox");
		
		driver = new RemoteWebDriver(new URL("http://172.28.1.88:4456/wd/hub"), caps);
		driver = new FirefoxDriver();
		driver.navigate().to("www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		driver.findElementByName("q").sendKeys("Selenium Grid"); 
		
		driver.findElementByName("btnG").click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
