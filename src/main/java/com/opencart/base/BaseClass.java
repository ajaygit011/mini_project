package com.opencart.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.PropertyConfigurator;


public class BaseClass {
	
	public static WebDriver driver;
	public static Properties property;
	public static Logger log;
	
	public BaseClass()
	{
		PropertyConfigurator.configure("Log4j.properties");
		try
		{
			property = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\ajay_bhave\\eclipse-workspace\\opencart_mini_project\\src\\main\\java\\com\\opencart\\config\\config.properties");
			property.load(fis);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
		
		public static void initalization()
		{
			String browser = property.getProperty("browser");
			
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(property.getProperty("url"));
			
			
			
		}
}



