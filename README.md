# juiceShop

This project contains automation test scripts for Registration, Login, Add 2 Items from each page, Increase the basket quantity by 2 for each item, Add New Delivery Address using java’s Random class, Add a new card and place the order, Verify the order history and LogOut of a Juice shop application. The tests are implemented using Page Factory Design Pattern, Selenium, WebDriver, Maven and Java

**Getting Started **
To get Started with this project, follow the instruction below

**Prerequisites**

Java JDK installed Maven Build tool installed Edge browser installed
Clone this repository to your local machine using the following command: https://github.com/thilagavathiamulraj/juiceShop

**Configuration**

1. Open the project in your preferred IDE
2. Go to Runner file -> Right click and Run as TestNG Tests


**Test Structure**

The tests are organized using the simple Page Factory Implementation design pattern, which allow you to define the webElement itself as a variable and separates the test logic from the page specific operations.

The test classes are located in the src/test/java/com/shop/juice directory. The test classes are as follows:

1. DriverFactory - contains static webDriver variable and getDriver methods declaration
2. Registration - contains the tests for launching the browser driver and registration
3. Login - contains the tests for login to juice shop application
4. AddMultipleItems - contains the testes to add 2 different items from all 3 pages
5. IncreaseQuantity - class contains test scripts to increase each quantity by 2
6. RandomValues - class contains the methods to generate the random string and numbers
7. AddNewAddressRandomDetails - class contains the tests to add new address using the random generated values by RandomValues class
* AddNewCard - contains the tests to add new card  for order payment  
* verifyOrder - class contains the tests verify the placed order details in the order history 
* WebElementClick - is a utility class which contains test to perform click action on a web element in a safest way by avoiding run time exceptions

**Test Output and reports**

1. You can see the output in console or emailable-report.html in the test-Output folder

