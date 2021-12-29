Feature: Place Order in SwagLabs
Scenario: Place Order
Given User is on Login page
When Users enters "standard_user" and "secret_sauce"
And User select the products
|Sauce Labs Bike Light|
|Sauce Labs Backpack|
And User clicks on Card icon
And User clicks on Checkout button
And user enters User information
And user Clicks on continue button
And User clicks on Finish button
Then users gets the success message  as"THANK YOU FOR YOUR ORDER"