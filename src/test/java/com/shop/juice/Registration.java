package com.shop.juice;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Registration {

	WebDriver driver = DriverFactory.driver;;

	String browserName = "Edge";

	String url = "https://juice-shop.herokuapp.com/#/register";

	@FindBy(xpath = "//span[text()='Dismiss']")
	WebElement prop_Registration_dismiss_Button;
	@FindBy(xpath = "//a[contains(text(),'Me want')]")
	WebElement prop_Registration_want_Button;
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	WebElement prop_Registration_account_Button;
	@FindBy(id = "navbarLoginButton")
	WebElement prop_Registration_Login_Button;
	@FindBy(linkText = "Not yet a customer?")
	WebElement prop_Registration_NotACustomer_link;
	@FindBy(id = "emailControl")
	WebElement prop_Registration_Email_Txt;
	@FindBy(xpath = "//input[@id='passwordControl']")
	WebElement prop_Registration_Password_Txt;
	@FindBy(xpath = "//input[@id='repeatPasswordControl']")
	WebElement prop_Registration_RepeatPassword_Txt;
	@FindBy(xpath = "//mat-label[contains(text(),' Security Question ')]")
	WebElement prop_Registration_SecurityQn_DropDown;
	@FindBy(xpath = "//span[contains(text(),' Your eldest siblings')]")
	WebElement prop_Registration_SelectQn_Option;
	@FindBy(id = "securityAnswerControl")
	WebElement prop_Registration_SecAnswer_Txt;
	@FindBy(xpath = "//span[text()=' Register ']")
	WebElement prop_Registration_Register_Btn;

	public void launch() throws Exception {

		if (browserName.equalsIgnoreCase("Edge")) {

			driver = DriverFactory.getEdgeDriver();

		} else if (browserName.equalsIgnoreCase("Chrome")) {

			driver = DriverFactory.getChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox"))

		{
			driver = DriverFactory.getFirefoxDriver();

		} else {

			System.out.println("Driver not found");
		}
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, this);

		prop_Registration_dismiss_Button.click();
		prop_Registration_want_Button.click();

	}

	public void userRegistration() throws Exception {

		
		PageFactory.initElements(driver, this);

		prop_Registration_account_Button.click();
		prop_Registration_Login_Button.click();
		prop_Registration_NotACustomer_link.click();
		prop_Registration_Email_Txt.sendKeys("test101@gmail.com");
		prop_Registration_Password_Txt.sendKeys("test101$");
		prop_Registration_RepeatPassword_Txt.sendKeys("test101$");
		prop_Registration_SecurityQn_DropDown.click();
		prop_Registration_SelectQn_Option.click();
		prop_Registration_SecAnswer_Txt.sendKeys("Test123");
		Thread.sleep(2000);
		prop_Registration_Register_Btn.click();

	}
/*
	void addingNewCard() throws Exception {

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),'Add new card')]")).click();

		String name = "TestName1";

		WebElement cardHolderName = driver
				.findElement(By.xpath("(//div[@class='mat-mdc-form-field-infix'])[2]//input[@type='text']"));

		WebElementClick.webClick(cardHolderName);
		cardHolderName.sendKeys(name);

		WebElement cardNumber = driver.findElement(By.xpath("//input[@type='number']"));
		WebElementClick.webClick(cardNumber);
		cardNumber.sendKeys("1234567890123636");

		WebElement expiryMonth = driver.findElement(By.xpath("(//div[@class='mat-mdc-form-field-infix'])[4]/select"));
		Select select = new Select(expiryMonth);
		select.selectByValue("9");

		WebElement expiryYear = driver.findElement(By.xpath("(//div[@class='mat-mdc-form-field-infix']/select)[2]"));
		Select selectExpiryYear = new Select(expiryYear);
		selectExpiryYear.selectByContainsVisibleText("2089");

		driver.findElement(By.xpath("//*[text() =' Add a coupon ']")).click();

		driver.findElement(By.xpath("//input[@id='coupon']")).sendKeys("1234567jy7");

		driver.findElement(By.xpath("//span[text()=' Redeem ']")).click();

		Thread.sleep(2000);
		WebElement couponErrorMessage = driver.findElement(By.xpath("//*[contains(text(),'Invalid')]"));

		String errorMessageText = couponErrorMessage.getText();

		System.out.println("Error message : " + errorMessageText);

		WebElement submitButton = driver.findElement(By.id("submitButton"));
		WebElementClick.webClick(submitButton);
		Thread.sleep(2000);
		WebElement selectCardRadioButton = driver.findElement(By.xpath("(//mat-cell[contains(text(),'" + name
				+ "')]/../mat-cell)[1]/mat-radio-button/div/div/div[2][@class='mdc-radio__background']"));

		WebElementClick.webClick(selectCardRadioButton);

		WebElement continueButtonClick = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
		WebElementClick.webClick(continueButtonClick);

		WebElement placeOrderAndPayButton = driver
				.findElement(By.xpath("//span[contains(text(),'Place your order and pay')]"));
		WebElementClick.webClick(placeOrderAndPayButton);
		System.out.println("Thank you for your purchase!");
		System.out.println("Order Placed");
	}

	void verifyOrderHistory() {

		driver.findElement(By.xpath(" //span[contains(text(),'Account')]")).click();
		WebElement orderPaymentButton = driver
				.findElement(By.xpath("//button[@aria-label='Show Orders and Payment Menu']"));
		WebElementClick.webClick(orderPaymentButton);

		driver.findElement(By.xpath(" //span[contains(text(),' Order History')]")).click();
		System.out.println("Order history verified");

		driver.findElement(By.xpath(" //span[contains(text(),'Account')]")).click();
		driver.findElement(By.id("navbarLogoutButton")).click();
		System.out.println("LoggedOut Successfully");

	}

	public static void main(String[] args) throws Exception {

		Registration registration = new Registration();
		registration.launch();
		registration.userRegistration();
		// registration.addToBasket();
		// registration.viewBasketAndItemIncrease();
		registration.addingNewCard();
		registration.verifyOrderHistory();

	}*/

}
