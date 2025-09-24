package com.shop.juice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddressRandomDetails {

	static WebDriver driver =DriverFactory.driver;
	
	@FindBy(xpath = "//span[contains(text(),' Address')]")WebElement prop_AddNewAddress_Address_Btn;
	@FindBy(xpath ="//input[@placeholder='Please provide a country.']")WebElement prop_AddNewAddress_Conuntry_Text;
	@FindBy(xpath = "//input[contains(@placeholder, 'name')]")WebElement prop_AddNewAddress_Name_Text;
	@FindBy(xpath = "//input[contains(@placeholder, 'mobile number')]")WebElement prop_AddNewAddress_MobileNUmber_Text;
	@FindBy(xpath = "//input[contains(@placeholder, 'ZIP code')]")WebElement prop_AddNewAddress_ZipCode_Text;
	@FindBy(xpath = "//textarea[@id='address']")WebElement prop_AddNewAddress_Address_Text;
	@FindBy(xpath = "//input[contains(@placeholder, 'Please provide a city')]")WebElement prop_AddNewAddress_City_Text;
	@FindBy(xpath = "//input[contains(@placeholder, 'state')]")WebElement prop_AddNewAddress_State_Text;
	@FindBy(id = "submitButton")WebElement prop_AddNewAddress_Submit_Btn;
	@FindBy(xpath = "//span[text() ='Continue']")WebElement prop_AddNewAddress_Continue_Btn;
	@FindBy(xpath = "(//*[contains(text(),'Fast Delivery')]/../mat-cell)[1]/mat-radio-button/div/div[@class='mdc-radio']")WebElement prop_AddNewAddress_DeliverySpeed_RadioBtn;
	@FindBy(xpath = "//*[text() ='Continue']")WebElement prop_AddNewAddress_SelectSpeed_RadioBtn;


	public  void addAddress() throws Exception {
	
		PageFactory.initElements(driver, this);

	
		prop_AddNewAddress_Address_Btn.click();
	

	WebElement country = prop_AddNewAddress_Conuntry_Text;
	String countryName =RandomValues.generatingRandom();
	System.out.println("CountryName : " + countryName);
	country.sendKeys(countryName);

	WebElement name = prop_AddNewAddress_Name_Text;
	String addressName =RandomValues.generatingRandom();
	System.out.println("AddressName : " + addressName);
	name.sendKeys(addressName);

	WebElement mobileNumber = prop_AddNewAddress_MobileNUmber_Text;
	String mobileNumberText = RandomValues.generateRandomNumber(10);
	System.out.println("MobileNumber text : " + mobileNumberText);
	mobileNumber.sendKeys(mobileNumberText);

	WebElement zipcode = prop_AddNewAddress_ZipCode_Text;
	String zipcodeText = RandomValues.generateRandomNumber(8);
	System.out.println("AddressName : " + zipcodeText);
	zipcode.sendKeys(zipcodeText);

	WebElement address = prop_AddNewAddress_Address_Text;
	String addressText =RandomValues.generatingRandom();
	System.out.println("AddressText : " + addressText);
	address.sendKeys(addressText);

	WebElement city = prop_AddNewAddress_City_Text;
	String cityText = RandomValues.generatingRandom();
	System.out.println("CityText : " + cityText);
	city.sendKeys(cityText);

	WebElement state = prop_AddNewAddress_State_Text;
	String stateText = RandomValues.generatingRandom();
	System.out.println("StateText : " + stateText);
	state.sendKeys(stateText);

	prop_AddNewAddress_Submit_Btn.click();
	Thread.sleep(2000);
	WebElement addressRadioButton = driver.findElement(By.xpath("(//*[contains(text(),'" + addressName
			+ "')]/../mat-cell)[1]/mat-radio-button/div/div[@class='mdc-radio']"));
	WebElementClick.webClick(addressRadioButton);

	WebElement clickContinueButton = prop_AddNewAddress_Continue_Btn;
	WebElementClick.webClick(clickContinueButton);
	Thread.sleep(2000);

	WebElement deliverySpeed = prop_AddNewAddress_DeliverySpeed_RadioBtn;
	WebElementClick.webClick(deliverySpeed);

	WebElement deliverySpeedContinueClick = prop_AddNewAddress_SelectSpeed_RadioBtn;
	WebElementClick.webClick(deliverySpeedContinueClick);
}
}
