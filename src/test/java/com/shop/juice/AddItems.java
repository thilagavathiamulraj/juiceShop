package com.shop.juice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItems {

	static WebDriver driver = DriverFactory.driver;

	@FindBy(xpath = "//button[@aria-label='Next page']" ) WebElement prop_AddItems_NextPage_Btn;
	WebElement prop_AddItems_PerPage_select;

	public void addToBasket() throws Exception {

		PageFactory.initElements(driver, this);

		String[] items = { "Apple Juice", "Lemon Juice" };

		for (String item : items) {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[contains(text(),'" + item+ "')]/../../../div[2]/button/span[2]/span[text()='Add to Basket']")).click();
		}

		prop_AddItems_NextPage_Btn.click();

		Thread.sleep(2000);

		String[] page2Items = { "CTF Girlie-Shirt", "OWASP Juice Shop Mug" };

		for (String item : page2Items) {

			driver.findElement(By.xpath("//div[contains(text(),'" + item+ "')]/../../../div[2]/button/span[2]/span[contains(text(),'Add to Basket')]")).click();

		}

		prop_AddItems_NextPage_Btn.click();

		Thread.sleep(2000);

		String[] page3Items = { "Shop T-Shirt", "Master X-Treme" };
		
		for (String item : page3Items) {

			driver.findElement(By.xpath("//div[contains(text(),'" + item+ "')]/../../../div[2]/button/span[2]/span[contains(text(),'Add to Basket')]")).click();
			

		}
	}
}
