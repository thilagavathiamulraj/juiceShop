package com.shop.juice;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncreaseQuantity {

	static WebDriver driver =  DriverFactory.driver;
	
	@FindBy(xpath = "//span[text()=' Your Basket']") WebElement Prop_IncreaseQuantity_Basket_Btn;
	@FindBy(id = "checkoutButton") WebElement Prop_IncreaseQuantity_CheckOut_Btn;

	public void viewBasketAndIncreaseItems() throws Exception {
		
		PageFactory.initElements(driver, this);

		Prop_IncreaseQuantity_Basket_Btn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String[] items = { "Apple Juice", "Lemon Juice", "CTF Girlie-Shirt", "OWASP Juice Shop Mug",
				"OWASP Juice Shop T-Shirt", "Forest Master X-Treme" };
		for (String item : items) {
			Thread.sleep(2000);
			WebElement itemNameToIncrease = driver
					.findElement(By.xpath("//mat-cell[contains(text(),'" + item + "')]/../mat-cell[3]/button[2]"));
			WebElementClick.webClick(itemNameToIncrease);
		}

		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		} catch (Exception e) {
			System.out.println("Alert not present or already closed.");
		}
		WebElement checkout = Prop_IncreaseQuantity_CheckOut_Btn;
		WebElementClick.webClick(checkout);

	}

}
