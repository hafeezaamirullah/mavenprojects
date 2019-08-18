package com.maven.AATestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public WebDriver  driver;

	public WebDriver createDriver(String browserType, String URL) {
		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/hafeezaamirullah/Documents/chromedriver");

			driver = new ChromeDriver();
			driver.get(URL);
		
		}
		else if(browserType.equals("mozilla")) {
			driver = new FirefoxDriver();
			driver.get(URL);
		}
		else if (browserType.equals("ie")) {
			driver = new InternetExplorerDriver();
			driver.get(URL);
		}
		else {
			System.out.println("Not A Valid driver");
		}
		driver.get(URL);
		return driver;
	}
	
	public void initDriver() {
		driver = createDriver("chrome","https://www.demo.iscripts.com/multicart/demo/register.php");
		
	}

}


