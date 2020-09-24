Feature: Sign in

Scenario: Test demowebshop with valid credentials
Given User has navigated to login page
When User provides username and password
Then user signs in successfully

Scenario: Test demowebshop with invalid data
Given Application is opened
When I provide valid username and invalid password
Then I should view a error message
