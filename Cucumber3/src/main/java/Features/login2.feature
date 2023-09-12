Feature: test login functionality

#Scenario: Check the login with valid credentials

#Given user is on login page
#When user enters email and password
#And clicks on login button 
#Then user is navigated to home page

Scenario Outline: Check login with valid credentials
Given user is on login page
When user enters "<email>" and "<password>"
And clicks on login button
Then user is navigated to homepage
Then user search men tops
Then user navigates to men tops page

Examples:
 |email               |password   |
 |afifanaz34@gmail.com|Pakistan47@|


