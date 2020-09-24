Feature: demo scenario outline for login

Scenario Outline: Successful login with valid data
Given application is opened
When I provide valid <email> and valid <password>
Then I should see the link

Examples:
|email                                          |password             |
|deekshitha.teegala850@gmail.com                |deekshitha@123       |
|rekhabr1@gmail.com                             |rekhab               |
|rekhabr3@gmail.com                             |rekhab               |