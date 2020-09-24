Feature: Check Login

@valid
Scenario: Successful login with valid credentials
Given user is on login page
When user enters valid username and password
And user clicks on login button
Then user should be able to see logout button

Scenario: UnSuccessful login with invalid credentials
Given user has opened login page
When user enters valid username and invalid password
And user clicked on login button
Then user should view a message Login was unsuccessful
