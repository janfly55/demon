Feature: Function Testing on Test me
Scenario: valid login
Given User has launched testme app in the browser
When user enters "Lalitha" & "Password123"
And click on the login button
Then user must be logged in successfully
