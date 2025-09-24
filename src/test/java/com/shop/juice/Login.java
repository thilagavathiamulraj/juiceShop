package com.shop.juice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	 static WebDriver driver =DriverFactory.driver;
	
	@FindBy(xpath = "//span[contains(text(),'Account')]") WebElement  prop_Registration_account_Button ;
	@FindBy(id = "navbarLoginButton")  WebElement  prop_Registration_Login_Button;
	@FindBy(xpath ="//input[@id='email']") WebElement prop_Registration_Email_Input;
	@FindBy(xpath = "//input[@id='password']") WebElement prop_Registration_Password_Input;
	@FindBy(xpath ="//span[text()=' Log in ']")WebElement prop_Registration_Login_Btn;
	
	public void userogIn() {
		
		PageFactory.initElements(driver, this);

		 prop_Registration_account_Button.click();
		 prop_Registration_Login_Button.click();
		 prop_Registration_Email_Input.sendKeys("test101@gmail.com");
		 prop_Registration_Password_Input.sendKeys("test101$");
		 prop_Registration_Login_Btn.click();

	}


}
