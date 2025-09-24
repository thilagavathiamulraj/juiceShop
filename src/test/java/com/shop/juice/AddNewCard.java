package com.shop.juice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCard {
	
	 static WebDriver driver = DriverFactory.driver;
	 
		@FindBy(xpath = "//*[contains(text(),'Add new card')]")WebElement prop_AddNewCard_AddNewCard_Text;
		@FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix'])[2]//input[@type='text']")WebElement prop_AddNewCard_HolderName_Input;
		@FindBy(xpath ="//input[@type='number']" )WebElement prop_AddNewCard_CardNumber_Btn;
		@FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix'])[4]/select" )WebElement prop_AddNewCard_SelectExpiryMonth_Btn;
		@FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/select)[2]")WebElement prop_AddNewCard_SelectExpiryYear_Btn;
		@FindBy(xpath = "//*[text() =' Add a coupon ']")WebElement prop_AddNewCard_AddACoupon_Text;
		@FindBy(xpath = "//input[@id='coupon']" )WebElement prop_AddNewCard_AddACoupon_Input;
		@FindBy(xpath = "//span[text()=' Redeem ']")WebElement prop_AddNewCard_Reedem_Btn;
		@FindBy(xpath = "//*[contains(text(),'Invalid')]")WebElement prop_AddNewCard_CouponCode_ErrorMsg;
		@FindBy(id = "submitButton")WebElement prop_AddNewCard_Submit_Btn;
		@FindBy(xpath = "//span[contains(text(),'Continue')]")WebElement prop_AddNewCard_Continue_Btn;
		@FindBy(xpath = "//span[contains(text(),'Place your order and pay')]")WebElement prop_AddNewCard_placeOrderAndPay_Btn;
		
		

	 
	public void addNewCard() throws InterruptedException {
		
		PageFactory.initElements(driver, this);
	
	Thread.sleep(2000);

	prop_AddNewCard_AddNewCard_Text.click();

	String name = "TestName1";

	WebElement cardHolderName = prop_AddNewCard_HolderName_Input;
	
	WebElementClick.webClick(cardHolderName);
	cardHolderName.sendKeys(name);

	WebElement cardNumber = prop_AddNewCard_CardNumber_Btn;
	WebElementClick.webClick(cardNumber);
	cardNumber.sendKeys("1234567890123636");

	WebElement expiryMonth =prop_AddNewCard_SelectExpiryMonth_Btn;
	Select select = new Select(expiryMonth);
	select.selectByValue("9");

	WebElement expiryYear = prop_AddNewCard_SelectExpiryYear_Btn;
	
	Select selectExpiryYear = new Select(expiryYear);
	
	selectExpiryYear.selectByContainsVisibleText("2089");
	
	prop_AddNewCard_AddACoupon_Text.click();

	prop_AddNewCard_AddACoupon_Input.sendKeys("1234567jy7");

	prop_AddNewCard_Reedem_Btn.click();

	Thread.sleep(2000);
	
	WebElement couponErrorMessage = prop_AddNewCard_CouponCode_ErrorMsg;

	String errorMessageText = couponErrorMessage.getText();

	System.out.println("Error message : " + errorMessageText);

	WebElement submitButton = prop_AddNewCard_Submit_Btn;
	WebElementClick.webClick(submitButton);
	Thread.sleep(2000);
	WebElement selectCardRadioButton = driver.findElement(By.xpath("(//mat-cell[contains(text(),'"+name+"')]/../mat-cell)[1]/mat-radio-button/div/div/div[2][@class='mdc-radio__background']"));
	
	WebElementClick.webClick(selectCardRadioButton);
	
	WebElement continueButtonClick = prop_AddNewCard_Continue_Btn;
	WebElementClick.webClick(continueButtonClick);
	
	WebElement placeOrderAndPayButton =prop_AddNewCard_placeOrderAndPay_Btn;
	WebElementClick.webClick(placeOrderAndPayButton);
	System.out.println("Thank you for your purchase!");
	System.out.println("Order Placed");
	
	
	
	}

}
