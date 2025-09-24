package com.shop.juice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyOrder {

	static WebDriver driver = DriverFactory.driver;
	
	@FindBy(xpath = "//span[contains(text(),'Account')]" ) WebElement prop_VerifyOrder_Account_Label;
	@FindBy(xpath = "//button[@aria-label='Show Orders and Payment Menu']" ) WebElement prop_VerifyOrder_OrderAndpayment_Label;
	@FindBy(xpath = " //span[contains(text(),' Order History')]" ) WebElement prop_VerifyOrder_OrderHistory_Label;
	


	void verifyOrderHistory() {
		
		PageFactory.initElements(driver, this);

		prop_VerifyOrder_Account_Label.click();
		WebElement orderPaymentButton = prop_VerifyOrder_OrderAndpayment_Label;
		WebElementClick.webClick(orderPaymentButton);

		prop_VerifyOrder_OrderHistory_Label.click();
		System.out.println("Order history verified");
		
		
		

		driver.findElement(By.xpath(" //span[contains(text(),'Account')]")).click();
		driver.findElement(By.id("navbarLogoutButton")).click();
		System.out.println("LoggedOut Successfully");

	}
	
	void verifyTrackOrder() {
		driver.findElement(By.xpath("mat-mdc-button-persistent-ripple mdc-icon-button__ripple")).click();
		
		}
}
