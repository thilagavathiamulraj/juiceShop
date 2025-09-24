# juiceShop

Project Description: Designed and developed automation test framework for the OWASP Juice Shop application by enabling end-to-end testing workflow 

➡️ What the script does

🔹Create a new user dynamically via the registration page and log in using the newly created credentials
🔹Add two items from each page to the shopping basket and navigate through multiple pages
🔹Increase quantity of all items in the cart by 2 and proceed to checkOut
🔹Add a new delivery address with random input values using java’s random class
🔹Select the address and delivery speed 
🔹Add a new card and also enter a 10 digit fake coupon to verify the error message 
🔹Select Card and place the order
🔹Verify the account history and log out from the application

💡 This script not only tests form handling, cart logic, and error validation, but also mimics a real-world user journey, making it ideal for regression or smoke testing scenarios in e-commerce platforms.

🛠️ Tools Used:
Java 
Selenium
Maven
TestNG
Page Factory Design pattern

Key highlights learned from this project: 

✅ Learned  to write dynamic and reusable xpath expressions by identifying common parent element in complex DOM structures, specifically for targeting product-specific "Add to Cart" buttons.  
⚙️ Used common WebElementClick utility class which incorporates WebDriverWait with ExpectedConditions to make script more reliable and faster, 
🛡️ Implemented try catch block to handle unexpected runtime exceptions
🔍 Used selenium inbuilt methods like isDisplayed() and isEnabled() to verify the state of the element’s before performing any action
🖱️ Effectively leveraged Actions.scrollToElement()  to ensure the element is visible into the visible viewport.This helps avoid common runtime issues like ElementNotInteractableException and ElementClickInterceptedException. especially useful for dynamically loaded and long-scroll web pages.

GitHub repo: 

#AutomationTesting 
#Java
#Selenium
#PageFactoryDesignPattern
#ReusableXPath
#UtilityClass
#TestNG 

