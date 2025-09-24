package com.shop.juice;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementClick {

	static WebDriver driver;
	
	public static boolean webClick(WebElement element) {
		
		driver= DriverFactory.driver;

		try {

			WebElement clickElement = new WebDriverWait(driver, Duration.ofSeconds(20))
					.until(ExpectedConditions.elementToBeClickable(element));
			if (clickElement.isDisplayed()) {

				if (clickElement.isEnabled()) {

					try {

						Actions action = new Actions(driver);
						action.scrollToElement(clickElement).click(clickElement).perform();

					} catch (Exception e) {

						JavascriptExecutor jse = (JavascriptExecutor) driver;
						jse.executeScript("arguments[0].click();", clickElement);
					}

				} else {
					System.out.println("Element is not enabled");

				}
			} else {
				System.out.println("Eleement is not dispalyed ");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return false;

	}

}
