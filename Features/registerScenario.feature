Feature: registering for demowebshop

Scenario: Successfull registration
Given user is on register page
When user enters Gender
And user enters FirstName,LastName and Email
And user enters password and confirmPassword
And user clicks on register button
Then user should see a message "Registration is successfull"