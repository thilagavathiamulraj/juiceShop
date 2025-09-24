package com.shop.juice;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Runner {

	static WebDriver driver;

	@Test(priority = 0)
	void launchAndRegistration() throws Exception {
		Registration registration = new Registration();
		registration.launch();
		registration.userRegistration();
	}

	@Test(priority = 1)
	void login() {
		Login login = new Login();
		login.userogIn();
	}

	@Test(dependsOnMethods = { "login" })
	void addMultipleItems() throws Exception {
		AddItems addProduct = new AddItems();
		addProduct.addToBasket();
	}

	@Test(dependsOnMethods = { "addMultipleItems" })

	void increaseBasketQuantityByTwo() throws Exception {
		IncreaseQuantity increaseEachItem = new IncreaseQuantity();
		increaseEachItem.viewBasketAndIncreaseItems();
	}

	@Test(dependsOnMethods = { "increaseBasketQuantityByTwo" })
	void addAddress() throws Exception {
		AddNewAddressRandomDetails addNewAddress = new AddNewAddressRandomDetails();
		addNewAddress.addAddress();
	}

	@Test(dependsOnMethods = { "addAddress" })
	void AddingNewCard() throws Exception {
		AddNewCard addCard = new AddNewCard();
		addCard.addNewCard();
	}

	@Test(dependsOnMethods = { "AddingNewCard" })
	void VerifyingTheOrder() {
		VerifyOrder verifyTheOrder = new VerifyOrder();
		verifyTheOrder.verifyOrderHistory();
	}

}
