package com.shop.juice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static WebDriver driver;
	
	public static WebDriver getEdgeDriver() {

		driver = new EdgeDriver();

		return driver;
	}

	public static WebDriver getChromeDriver() {

		driver = new ChromeDriver();

		return driver;
	}

	public static WebDriver getFirefoxDriver() {

		driver = new FirefoxDriver();

		return driver;
	}

	public static WebDriver getDriver(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else {

			System.out.println("Browser Not Found");

		}
		return driver;

	}

}
