Feature: Login with datatable

Scenario: Successful login with valid with valid entries
Given user is on demowebshoptricentis page
When user signs in with valid email and valid password
|deekshitha.teegala850@gmail.com|deekshitha@123|
Then user should see logout
