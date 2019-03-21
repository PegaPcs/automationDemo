package com.excellus.bdd.aut.pcs.core;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

/**
 * this file manages and creates the webdrivers.
 * @author prithwish.das
 *
 */
public class DriverFactory
{
	private static Logger log = Logger.getLogger(DriverFactory.class.getName());
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	
	public static String baseURL = Constants.PCS_URL;
	
	public  void createDriver(Scenario scenario) throws MalformedURLException, InterruptedException 
	{		
		if(driver == null)
		{
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_DIR);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			log.info("Execution started on Chrome browser");
			log.info("Browser launched successfully");
			
			driver.get(baseURL);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(60, TimeUnit.MICROSECONDS);
		    waitVar = new WebDriverWait(driver, 30);
		}
		
		
		
	}
	
	public WebDriver getInstance() {
		return driver;
	}

	/**
	 * This function is to close driver instance
	 */
	public void closeDriver(Scenario scenario) 
	{		
		if (driver != null)
		{
			if (scenario.isFailed()) 
			{
				scenario.embed(((TakesScreenshot) driver ).getScreenshotAs(OutputType.BYTES), "image.png");
				scenario.write("Scenario Failed");
			}
				else
				{
					scenario.write("Scenario Passed");
				}
		}
	
		
		if (driver != null)
		{
			driver.close();
			// closes all the browser windows opened by web driver
			driver.quit();
		}
	}
}